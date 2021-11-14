package com.example.mysqldemo.config.interceptor;

import com.alibaba.fastjson.JSON;
import com.example.mysqldemo.exception.GeneralException;
import com.example.mysqldemo.exception.LoginResultCode;
import com.example.mysqldemo.service.redis.RedisService;
import com.example.mysqldemo.utils.LoginUtils;
//import feign.RequestInterceptor;
//import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

    private static final String API_INTERNAL = "internal";
    public static final int JWT_BEARER_SPLIT_LENGTH = 2;
    public static final int JWT_DOT_SPLIT_LENGTH = 3;

    @Resource
    private RedisService redisService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());

        // 内部api直接过
        log.info("requestURI uri:{}", request.getRequestURI());
        log.info("requestURL url:{}", request.getRequestURL());
        if (request.getRequestURI().contains(API_INTERNAL) || request.getRequestURI().contains("session")) {
            return true;
        }
        
        log.info("X-GATEWAY-UID uid:{}", request.getHeader("X-GATEWAY-UID"));
        String userId = request.getHeader("X-GATEWAY-UID");
        log.info("login userId：" + userId);

        // 用户当前选择的身份
        log.info("X-IDENTITY-ID id:{}", request.getHeader("X-IDENTITY-ID"));
        String identityId = request.getHeader("X-IDENTITY-ID");
        log.info("login identityId：" + identityId);

        if (StringUtils.isNotBlank(userId)) {
            long expireTime = redisService.getExpireWithPrefix(userId);
            if ( expireTime> 0){
                redisService.expireWithPrefix(userId,2, TimeUnit.MINUTES);
            }else {
                throw new GeneralException(LoginResultCode.UNAUTHORIZED, "LoginUtils",
                        "getLoginUser");
            }

            LoginUser loginUser = new LoginUser();
            loginUser.setId(Long.valueOf(userId));
            loginUser.setIdentityId(Integer.parseInt(Optional.ofNullable(identityId).orElse("0")));
            request.getSession().setAttribute(LoginUtils.LOGIN_USER, loginUser);
        } else {
            LoginUser loginUser = getLoginUser(request, response);
            if (loginUser != null) {
                request.getSession().setAttribute(LoginUtils.LOGIN_USER, loginUser);
            }
        }

        return true;
    }

    private LoginUser getLoginUser(HttpServletRequest request, HttpServletResponse response) {
        //请求的token
        String token = request.getHeader("authorization");
        if (StringUtils.isNotEmpty(token)) {
            // 分离：Bearer token
            String[] tokenArray = token.split(" ");
            if (JWT_BEARER_SPLIT_LENGTH == tokenArray.length) {
                String[] jwtArray = tokenArray[1].split("\\.");
                if (JWT_DOT_SPLIT_LENGTH == jwtArray.length) {
                    String jwtPayload = jwtArray[1];
                    if (StringUtils.isNotEmpty(jwtPayload)) {
                        //java.utils.Base64 解码不兼容非base64编码字符 切换使用org.apache.commons.codec.binary.Base64解码
                        String jwtPayloadJson = new String(Base64.decodeBase64(jwtPayload));
                        return JSON.parseObject(jwtPayloadJson, LoginUser.class);
                    }
                }
            }
        }
        return null;
    }


//    /**
//     * Feign请求拦截器（设置请求头，传递token信息）
//     *
//     * @author zhangshuguang
//     * @version 1.0.0
//     * @date 2020/04/29
//     **/
//    public static class FeignBasicAuthRequestInterceptor implements RequestInterceptor {
//
//        @Override
//        public void apply(RequestTemplate requestTemplate) {
//            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//            if (attributes != null) {
//                HttpServletRequest request = attributes.getRequest();
//                LoginUser loginUser = (LoginUser) request.getSession().getAttribute(LoginUtils.LOGIN_USER);
//                byte[] encode = java.util.Base64.getEncoder().encode(JSON.toJSONString(loginUser).getBytes(StandardCharsets.UTF_8));
//                requestTemplate.header("X-GAODUN-OCRM-USER", new String(encode));
//            }
//        }
//    }
}

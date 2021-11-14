package com.example.mysqldemo.utils;

import com.example.mysqldemo.config.interceptor.LoginUser;
import com.example.mysqldemo.exception.GeneralException;
import com.example.mysqldemo.exception.LoginResultCode;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.Optional;

/**
 * @author jmc
 */
public class LoginUtils {

  public static final String LOGIN_USER = "loginUser";
  public static final int JWT_BEARER_SPLIT_LENGTH = 2;
  public static final int JWT_DOT_SPLIT_LENGTH = 3;

  /**
   * 从session中获取loginUser，没有则返回null
   *
   * @return LoginUser 登录用户信息
   * @throws GeneralException 用户未登录异常
   */
  public static LoginUser getLoginUser() throws GeneralException {
    RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
    if (attributes != null) {
      Object obj = attributes.getAttribute(LOGIN_USER, RequestAttributes.SCOPE_SESSION);
      if (obj instanceof LoginUser) {
        return (LoginUser) obj;
      }
    }
    throw new GeneralException(LoginResultCode.UNAUTHORIZED, "LoginUtils",
        "getLoginUser");
  }

  /**
   * 获取当前用户的Id
   */
  public static Integer getLoginUserId() {
    //return 1; // add by zhaoming 测试阶段
    LoginUser loginUser = Optional.ofNullable(getLoginUser()).orElse(new LoginUser());
    return Optional.ofNullable(loginUser.getId()).orElse(0L).intValue();
  }
}

package com.example.mysqldemo.feign;

import com.example.mysqldemo.bean.Ocean;
import com.example.mysqldemo.feign.input.OceanInput;
import com.example.mysqldemo.response.ResultWrapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * OCRM字典服务Solon Client
 *
 * @author Sunny.Zeng
 * @date 2021-03-18
 */
@FeignClient(name = "solonClient", url = "${third-party.config.solon.host}")
public interface SolonClient {
    /**
     * 根据老的行为id获取对应的新的行为数据
     *
     * @param customerSourceId crm用户行为id
     * @return
     */
    @GetMapping("/api/v1/user-behavior/source-id")
    ResultWrapper<String> getUserBehaviorNew(@RequestParam("customerSourceId") Integer customerSourceId);

    @PostMapping(value = "/api/v1/ocean/add", headers = {"X-GATEWAY-UID=1"})
    ResultWrapper<Ocean> addOcean(@RequestBody OceanInput record);

    @PostMapping(value = "/api/v1/authority/cache-token", headers = {"X-GATEWAY-UID=1"})
    ResultWrapper<Boolean> cacheToken();
}

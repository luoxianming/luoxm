package com.example.mysqldemo;

import com.alibaba.fastjson.JSONObject;
import com.example.mysqldemo.bean.Ocean;
import com.example.mysqldemo.feign.SolonClient;
import com.example.mysqldemo.feign.input.OceanInput;
import com.example.mysqldemo.response.ResultWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author luoxianming
 * @date 2021/7/2 10:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OceanServiceTest {

    @Resource
    private SolonClient solonClient;

    @Test
    public void oceanAddTest(){
        System.out.println(solonClient.cacheToken());

        String oceans = "{\"oceanName\":\"34233\",\"oceanOwners\":[{\"id\":2657,\"name\":\"高顿集团(CRM)\",\"organization\":true}],\"personnelAttributes\":0,\"oceanScopes\":[{\"id\":4661,\"name\":\"上海直销中心-ACCA2部\",\"organization\":true,\"code\":\"2657.14472\"}],\"oceanType\":\"1\",\"oceanCategory\":2}";
        OceanInput oceanInput = JSONObject.parseObject(oceans, OceanInput.class);
        ResultWrapper<Ocean> resultWrapper = solonClient.addOcean(oceanInput);
        System.out.println(resultWrapper);
    }
}

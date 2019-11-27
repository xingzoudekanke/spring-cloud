package com.example.confg.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghuan
 * @create 2019-11-27
 */
@RestController
//刷新触发地址/actuator/refresh
// 1.curl -X POST http://127.0.0.1:9006/actuat/refresh
// 2.postMan post
@RefreshScope
public class ConfigTestController {

    //配置信息通过@Value注解读取,配置项用${配置项}读取
    @Value("${test.config}")
    private String configBluersw;

    @RequestMapping("/ConfigTest")
    public String ConfigTest(){
        return this.configBluersw;
    }
}

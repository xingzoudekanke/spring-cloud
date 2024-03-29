package com.example.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghuan
 * @create 2019-11-26
 */
@RestController
public class ErrorHandle {
    @RequestMapping("/default-error")
    public String DefaultErrorHandle() {
        return "这是通用错误处理返回的信息。";
    }

    @RequestMapping("/service-provider-error")
    public String ServiceProviderErrorHandle(){
        return "这是ServiceProvider服务专属的错误处理信息。";
    }
}
package com.example.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        String a = "1234567890";
        String b = a.substring(0,9);
        String c = a.substring(0,1);
        String d = a.substring(1,1);
        String e = a.substring(1,2);
        String f = a.substring(1,a.length());
        return "您好！"+name+",这是一个微服务。";
    }
}

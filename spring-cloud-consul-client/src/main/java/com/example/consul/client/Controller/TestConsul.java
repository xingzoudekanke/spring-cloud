package com.example.consul.client.Controller;

import com.example.consul.client.Services.ServiceProviderRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConsul {

    @Autowired
    ServiceProviderRemote remote;

    @RequestMapping("/TestHello")
    public String TestHello(){
        String first = remote.Hello("first-SWS");
        String second = remote.Hello("second-SWS");
        return first + " | " + second;
    }

    @RequestMapping("/Test")
    public String Test(){
        return "OK";
    }
}
package com.hotmail.huzy8080.eurekaconsumer.controller;

import com.hotmail.huzy8080.eurekaconsumer.model.User;
import com.hotmail.huzy8080.eurekaconsumer.proxy.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerTestController {


    @Autowired
    DcClient dcClient;

    @RequestMapping("consumer-feign-test")
    public Object consumerTest(){
        return "feign: "+dcClient.test();
    }
    @RequestMapping("/user")
    public User getUser(){
        return dcClient.getUser();
    }
}

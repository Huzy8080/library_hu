package com.hotmail.huzy8080.eurekaconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public Object consumerTest(){

        return restTemplate.getForObject("http://eureka-client/test", String.class);
    }

    public String fallback(){
        return "fallback";
    }
}

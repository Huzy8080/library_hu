package com.hotmail.huzy8080.eurekaconsumer.proxy;

import com.hotmail.huzy8080.eurekaconsumer.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "EUREKA-CLIENT")
public interface DcClient {

    @RequestMapping(value = "/test")
    //这里不能返回Object类型？
    String test();

    @RequestMapping("/user")
    User getUser();
}

package com.hotmail.huzy8080.eurekaclient.controller;

import com.hotmail.huzy8080.eurekaclient.model.User;
import com.hotmail.huzy8080.eurekaclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public Object test() {
        return testService.test();
    }

    @RequestMapping("/user")
    public User getUser() {
        User user = new User();
        user.setId(5);
        user.setName("san");
        return user;
    }

}

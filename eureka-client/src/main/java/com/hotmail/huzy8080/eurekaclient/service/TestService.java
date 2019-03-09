package com.hotmail.huzy8080.eurekaclient.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    public Object test() {
        return "test-service : port:2001";
    }
}

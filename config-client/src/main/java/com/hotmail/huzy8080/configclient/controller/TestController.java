package com.hotmail.huzy8080.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${from}")
    String from;

    @Value("${version}")
    String version;

    @RequestMapping("/from")
    public String getFrom() {
        return this.from;
    }

    @RequestMapping("/version")
    public String getVersion(){
        return this.version;
    }
}

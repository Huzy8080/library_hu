package com.hotmail.huzy8080.quota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class QuotaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuotaApplication.class, args);
    }

}

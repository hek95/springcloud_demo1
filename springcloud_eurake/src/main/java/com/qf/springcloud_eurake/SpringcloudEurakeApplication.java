package com.qf.springcloud_eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启EurekaServer服务
@EnableEurekaServer
public class SpringcloudEurakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurakeApplication.class, args);
    }

}

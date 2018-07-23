package com.cll.mayj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//spring-boot开启注解
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class BlogConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogConfigApplication.class, args);
    }
}

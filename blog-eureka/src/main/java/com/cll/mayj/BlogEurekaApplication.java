package com.cll.mayj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//spring-boot启动注解
@SpringBootApplication
//spring-cloud服务注解
@EnableEurekaServer
public class BlogEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogEurekaApplication.class, args);
    }
}

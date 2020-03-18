package com.lyc.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author : mikin.Lei
 * @date : 2020-3-7 18:33
 * @description :
 */
@SpringBootApplication
@Configuration
@MapperScan("com.lyc.userservice.mapper")
//开启Eureka客户端发现功能
@EnableEurekaClient
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}

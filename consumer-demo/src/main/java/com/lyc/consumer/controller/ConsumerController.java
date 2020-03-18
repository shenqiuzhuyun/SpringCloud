package com.lyc.consumer.controller;

import com.lyc.consumer.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : mikin.Lei
 * @date : 2020-3-10 18:21
 * @description :
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id){
        //获取eureka中注册的user-service实例
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = serviceInstances.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/" + id;
        System.out.println(url);
        return restTemplate.getForObject(url, User.class);
    }
}

package org.example.test;

import org.example.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author : mikin.Lei
 * @date : 2020-2-24 1:26
 * @description :
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RestTemplateTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void  test(){
        String url = "http://localhost:8080/web/users/get";
        // restTemplate可以对json串进行反序列化
        // 1.返回的为user对象可以直接使用User.class
//        User result = restTemplate.getForObject(url, User.class);
//        System.out.println(result);
        // 2.返回的为list改为数组接收，在将数组转化为List。
        User[] users = restTemplate.getForObject(url, User[].class);
        List<User> userList = Arrays.asList(users);
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}

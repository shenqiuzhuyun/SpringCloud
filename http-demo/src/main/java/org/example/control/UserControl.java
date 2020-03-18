package org.example.control;

import org.example.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : mikin.Lei
 * @date : 2020-3-1 22:41
 * @description :
 */
@RestController
@RequestMapping("/users")
public class UserControl {

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> users(){
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setId(12321312L);
        user1.setName("张三");
        user1.setAge(18);
        user1.setGender("男");
        User user2 = new User();
        user2.setId(1111L);
        user2.setName("李四");
        user2.setAge(11);
        user2.setGender("男");
        User user3 = new User();
        user3.setId(2222L);
        user3.setName("王五");
        user3.setAge(20);
        user3.setGender("男");
        User user4 = new User();
        user4.setId(3333L);
        user4.setName("赵六");
        user4.setAge(24);
        user4.setGender("女");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }
}

package com.lyc.userservice.service.impl;

import com.lyc.userservice.mapper.UserMapper;
import com.lyc.userservice.pojo.User;
import com.lyc.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : mikin.Lei
 * @date : 2020-3-10 10:11
 * @description :
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}

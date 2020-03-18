package com.lyc.userservice.service;

import com.lyc.userservice.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author : mikin.Lei
 * @date : 2020-3-10 10:10
 * @description :
 */

public interface UserService {

    /**
     * 根据ID查询用户
     * @return
     */
    User queryById(Long id);


}

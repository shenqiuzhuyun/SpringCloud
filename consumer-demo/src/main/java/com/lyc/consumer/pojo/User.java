package com.lyc.consumer.pojo;

import lombok.Data;
import java.util.Date;

/**
 * @author : mikin.Lei
 * @date : 2020-3-10 9:56
 * @description :
 */
@Data
public class User {

    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别， 0男性 1女性
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 创建时间
     */
    private Date createTime;
}

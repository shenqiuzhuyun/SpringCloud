package com.lyc.userservice.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author : mikin.Lei
 * @date : 2020-3-10 9:56
 * @description :
 */
@Data
@Table(name = "t_user")
public class User {

    @KeySql(useGeneratedKeys = true)
    @Id
    @Column( name = "id")
    private Long id;

    /**
     * 用户名
     */
    @Column( name = "user_name")
    private String userName;

    /**
     * 密码
     */
    @Column( name = "password")
    private String password;

    /**
     * 姓名
     */
    @Column( name = "name")
    private String name;

    /**
     * 年龄
     */
    @Column( name = "age")
    private Integer age;

    /**
     * 性别， 0男性 1女性
     */
    @Column( name = "sex")
    private Integer sex;

    /**
     * 出生日期
     */
    @Column( name = "birthday")
    private Date birthday;

    /**
     * 创建时间
     */
    @Column( name = "create_time")
    private Date createTime;
}

CREATE DATABASE `springcloud` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`
(
    `id`     BIGINT(20)        NOT NULL COMMENT '用户ID',
    `user_name`   VARCHAR(50)  NULL COMMENT '用户名',
    `password`    VARCHAR(200) NULL COMMENT '用户密码',
    `name`        VARCHAR(50)  NULL COMMENT '姓名',
    `age`         INT(3)       NULL COMMENT '年龄',
    `sex`         INT(2)       NULL COMMENT '性别 1：女性 0：男性',
    `birthday`       date      NULL COMMENT '生日',
    `create_time` datetime(0)  NULL COMMENT '创建时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = INNODB ,
  DEFAULT CHARSET = utf8 ,COMMENT '用户表';

INSERT INTO `t_user` VALUES (8, 'zhangsan', '123456', '张三', 27, 0, '2020-3-10', '2020-3-10 10:37:31');

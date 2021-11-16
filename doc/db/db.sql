CREATE DATABASE IF NOT EXISTS admin DEFAULT CHARSET utf8;

use admin;

CREATE TABLE `user` (
    `id` bigint(20) NOT NULL COMMENT '主键ID',
    `name` varchar(30) DEFAULT NULL COMMENT '姓名',
    `money` bigint(20) DEFAULT '0' COMMENT '账户余额',
    `address` varchar(256) DEFAULT NULL COMMENT '地址',
    `state` varchar(10) DEFAULT NULL COMMENT '状态',
    `date` date DEFAULT NULL COMMENT '注册时间',
    `thumb` varchar(100) DEFAULT NULL COMMENT '头像地址',
    `age` int(11) DEFAULT NULL COMMENT '年龄',
    `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';


INSERT INTO `user` (id,name,money,address,state,`date`,thumb,age,email) VALUES
(1,'Jone',123,'广东省东莞市长安镇','成功','2019-11-01','https://lin-xin.gitee.io/images/post/wms.png',18,'test1@baomidou.com'),
(2,'Jack',456,'广东省广州市白云区','成功','2019-10-11','https://lin-xin.gitee.io/images/post/node3.png',20,'test2@baomidou.com'),
(3,'Tom',789,'湖南省长沙市','失败','2019-11-11','https://lin-xin.gitee.io/images/post/parcel.png',28,'test3@baomidou.com'),
(4,'Sandy',1011,'福建省厦门市鼓浪屿','成功','2019-10-20','https://lin-xin.gitee.io/images/post/notice.png',21,'test4@baomidou.com'),
(5,'Billie',1011,'福建省厦门市鼓浪屿','成功','2019-10-20','https://lin-xin.gitee.io/images/post/notice.png',24,'test5@baomidou.com');

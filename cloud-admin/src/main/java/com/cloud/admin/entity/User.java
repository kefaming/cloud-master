package com.cloud.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "user")
public class User {
    private Long id;
    private String name;
    private Integer money;
    private String address;
    private String state;
    private Date date;
    private String thumb;
    private Integer age;
    private String email;

}

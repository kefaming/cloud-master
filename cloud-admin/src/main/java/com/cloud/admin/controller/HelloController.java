package com.cloud.admin.controller;

import com.cloud.admin.entity.User;
import com.cloud.admin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HelloController {

    @Value("${user.name}")
    String userName;

    @Autowired
    private UserService userService1;

    @RequestMapping("/selectById")
    public String selectById(@RequestBody String id) {
        String name = userService1.selectById(id);
        return name;
    }
}

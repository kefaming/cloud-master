package com.cloud.user.controller;

import com.cloud.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;


@Slf4j
@Controller
public class HelloController {

    @Value("${user.name}")
    String userName;

    @Resource
    private UserService userService;

    @RequestMapping("/hello/{id}")
    public String hello(Map<String, Object> map, @PathVariable("id") String id) throws InterruptedException {
        System.out.println(("----- selectById method test ------"));
//        List<User> userList = userService.selectList();
////        List<User> userList = userMapper.selectList(null);
//        userList.forEach(System.out::println);
//        log.debug(userName);
//        System.out.println(userName);

        String name = userService.selectById(id);
        map.put("name", name);
        return "hello";
    }
}

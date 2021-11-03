package com.cloud.admin.controller;

import com.cloud.admin.entity.User;
import com.cloud.admin.exception.BizException;
import com.cloud.admin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Value;


@Slf4j
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/selectById/{id}", method = RequestMethod.GET)
    public String selectById(@PathVariable("id") String id) {
        if(1 > 0){
            throw new BizException(9, "自定义异常信息");
        }
        String name = userService.selectById(id);
        return name;
    }
}

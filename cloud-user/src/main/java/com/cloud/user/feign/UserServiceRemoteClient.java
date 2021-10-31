package com.cloud.user.feign;

import com.cloud.user.entity.User;
import org.aspectj.weaver.ast.Test;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "cloud-admin", fallback = Test.class)
public interface UserServiceRemoteClient {

    @RequestMapping(value = "/selectById", method = RequestMethod.GET)
    String selectById(String id);

}

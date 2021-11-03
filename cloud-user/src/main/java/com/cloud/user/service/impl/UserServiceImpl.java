package com.cloud.user.service.impl;

import com.cloud.user.client.UserRemoteClient;
import com.cloud.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserRemoteClient userRemoteClient;

    @Override
    public String selectById(String id) {
        return userRemoteClient.selectById(id);
    }

}

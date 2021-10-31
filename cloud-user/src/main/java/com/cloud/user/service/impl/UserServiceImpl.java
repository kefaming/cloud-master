package com.cloud.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cloud.user.entity.User;
import com.cloud.user.feign.UserServiceRemoteClient;
import com.cloud.user.mapper.UserMapper;
import com.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService1")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Autowired
    private UserServiceRemoteClient userServiceRemoteClient;

    @Override
    public List<User> selectList() {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.like("name", "雨").lt("age", 40);
        return userMapper.selectList(wrapper);
    }

    @Override
    public String selectById(String id) {
//        User user = userMapper.selectById(id);
//        System.out.println(user);
        return userServiceRemoteClient.selectById(id);
    }

}

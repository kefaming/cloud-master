package com.cloud.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cloud.admin.entity.User;
import com.cloud.admin.mapper.UserMapper;
import com.cloud.admin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService1")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.like("name", "雨").lt("age", 40);
        return userMapper.selectList(wrapper);
    }

    @Override
    public String selectById(String id) {
        User user = userMapper.selectById(id);
        return user.getName();
    }

}

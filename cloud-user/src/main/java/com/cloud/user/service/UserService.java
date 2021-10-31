package com.cloud.user.service;

import com.cloud.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectList();
    String selectById(String id);
}

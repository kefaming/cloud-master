package com.cloud.admin.service;

import com.cloud.admin.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectList();

    String selectById(String id);
}

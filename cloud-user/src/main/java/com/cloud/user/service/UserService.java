package com.cloud.user.service;

public interface UserService {
    String selectById(String id) throws InterruptedException;
}

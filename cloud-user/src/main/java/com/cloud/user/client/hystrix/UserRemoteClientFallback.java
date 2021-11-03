package com.cloud.user.client.hystrix;

import com.cloud.user.client.UserRemoteClient;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserRemoteClientFallback implements UserRemoteClient {
    @Override
    public String selectById(String id) {
        System.out.println("系统异常，请稍后再试！");
        Map<String, Object> map = new HashMap<>();
        map.put("name", "出错了");
        return "hello";
    }
}

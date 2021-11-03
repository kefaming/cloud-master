package com.cloud.user.client.hystrix;

import com.cloud.user.client.UserRemoteClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserRemoteClientFallbackFactory implements FallbackFactory<UserRemoteClient> {
    @Override
    public UserRemoteClient create(Throwable throwable) {
        return new UserRemoteClient() {
            @Override
            public String selectById(String id) {
                System.out.println("远程调用被限流或降级了，throwable："+throwable);
                return null;
            }
        };
    }
}

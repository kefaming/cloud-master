package com.cloud.user.client;

import com.cloud.user.client.hystrix.UserRemoteClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-admin", fallback = UserRemoteClientFallback.class)
public interface UserRemoteClient {

    @RequestMapping(value = "/selectById/{id}",method = RequestMethod.GET)
    String selectById(@PathVariable("id") String id);
}

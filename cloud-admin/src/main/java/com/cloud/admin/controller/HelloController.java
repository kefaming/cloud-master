package com.cloud.admin.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cloud.admin.entity.User;
import com.cloud.admin.exception.BizException;
import com.cloud.admin.mapper.UserMapper;
import com.cloud.admin.service.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.json.JSONObject;
import org.mockito.internal.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@RestController
public class HelloController {
//    @Autowired
//    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value="/selectById/{id}", method = RequestMethod.GET)
    public String selectById(@PathVariable("id") String id) {
//        if(1 > 0){
//            throw new BizException(9, "自定义异常信息");
//        }
        User user = userMapper.selectById(id);
        return user.getName();
    }

    @RequestMapping(value="/selectList", method = RequestMethod.POST)
    public Map<String, Object> selectList(@Param("pageNo") Integer pageNo, @Param("address") String address) {
        QueryWrapper wrapper = new QueryWrapper();
        if(StringUtils.isNoneEmpty(address)){
            wrapper.like("address", address);
        }
        List<User> list = userMapper.selectList(wrapper);
        Map<String, Object> map = new HashMap<>();
        map.put("list", list);
        map.put("pageTotal", list.size());
        return map;
    }

    @RequestMapping(value="/removeById", method = RequestMethod.GET)
    public Map<String, Object> removeById(@Param("id") Integer id) {
        int count = userMapper.deleteById(id);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        return map;
    }


    @RequestMapping(value="/editById", method = RequestMethod.POST)
    public Map<String, Object> editById(@RequestBody User user) {
        int count = userMapper.updateById(user);
        Map<String, Object> map = new HashMap<>();
        map.put("status", 0);
        return map;
    }



}

package com.dzkd.soft.controller;


import com.dzkd.soft.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dzkd.soft.pojo.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class userController {

    @Resource
    private UserService service;

    @RequestMapping("/selectId")        // 定义一个用户可以访问的网络接口通道
    public User  selectId(@RequestParam Integer id) {
        return service.selectId(id);

    }

    @RequestMapping("/selectIdAndName")        // 定义一个用户可以访问的网络接口通道
    public User  selectIdAndName(@RequestParam Integer id,@RequestParam String name) {
        return service.selectByIdAndName(id,name);
    }

    @RequestMapping("/selectNameAndPass")        // 定义一个用户可以访问的网络接口通道
    public Map<String ,Object> selectNameAndPass(@RequestParam String name, @RequestParam String pass) {
        User user=service.selectByNameAndPass(name,pass);
        Map<String, Object> map = new HashMap<>();   // 初始化一个返回数据对象
        map.put("code", 200);
        map.put("user", user);                 // 绑定指定的key和value
        return map;
    }


}

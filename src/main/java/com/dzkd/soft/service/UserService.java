package com.dzkd.soft.service;

import com.dzkd.soft.mapper.UserMapper;
import com.dzkd.soft.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public  User selectId(Integer id){
        return userMapper.selectById(id);
    }

    public User selectByIdAndName (Integer id,String name){return userMapper.selectByIdAndName(id,name);}

    public User selectByNameAndPass (String name,String pass){
        User user= userMapper.selectByNameAndPass(name,pass);
        return user;
    }
}

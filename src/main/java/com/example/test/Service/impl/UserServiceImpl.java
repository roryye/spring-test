package com.example.test.Service.impl;

import com.example.test.Service.UserService;
import com.example.test.common.ServerResponse;
import com.example.test.dao.UserMapper;
import com.example.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {

        User user = userMapper.selectLogin(username, password);
        if(user == null){
            return ServerResponse.createByErrorMessage("密码错误");
        }

        return ServerResponse.createBySuccess("登录成功", user);
    }
}

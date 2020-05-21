package com.example.test.Service;

import com.example.test.common.ServerResponse;
import com.example.test.entity.User;

public interface UserService {

    public ServerResponse<User> login(String username, String password);
}

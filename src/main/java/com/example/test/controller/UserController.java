package com.example.test.controller;

import com.example.test.Service.UserService;
import com.example.test.common.ServerResponse;
import com.example.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;


//    @RequestMapping(value = "login", method = RequestMethod.POST)
//    @ResponseBody
//    public ServerResponse Login(@RequestParam(value = "username") String username,
//                                @RequestParam(value = "password") String password){
//        return ServerResponse.createBySuccess();
//    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse Login(@RequestBody Map map) {
        String username = (String) map.get("username");
        String password = (String) map.get("password");

        return userService.login(username, password);
    }

//    @RequestMapping(value = "login", method = RequestMethod.POST)
//    @ResponseBody
//    public ServerResponse Login(@RequestBody User user) {
//
//        return ServerResponse.createBySuccess();
//    }

}

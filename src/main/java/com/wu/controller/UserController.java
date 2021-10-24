package com.wu.controller;

import com.wu.pojo.User;
import com.wu.service.UserService;
import com.wu.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping(path = "/findAll")
    @ResponseBody
    public Result findAll() {
        List<User> users = userService.findAll();
        return Result.ok(users);
    }

}

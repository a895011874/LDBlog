package com.dong.controller;

import com.dong.HttpUtils.HttpRes;
import com.dong.dao.User;
import com.dong.service.IUserService;
import com.dong.util.JSONParamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Administrator on 2017/11/22.
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public HttpRes addUser(@RequestBody String userData) {
        HttpRes res = new HttpRes();

        User user = new User();

        UUID uuid = UUID.randomUUID();
        user.setId(uuid.toString());
        user.setUsername(JSONParamUtil.getValue(userData, "username"));
        user.setPassword(JSONParamUtil.getValue(userData, "password"));
        user.setEmail(JSONParamUtil.getValue(userData, "email"));
        user.setPhone(JSONParamUtil.getValue(userData,"phone"));

        userService.addUser(user);
        res.setState(HttpRes.SUCCESS);
        return res;

    }
}

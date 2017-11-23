package com.dong.controller;

import com.alibaba.fastjson.JSONObject;
import com.dong.HttpUtils.HttpRes;
import com.dong.dao.User;
import com.dong.service.IUserService;
import com.dong.util.JSONParamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.UUID;

/**
 * Created by Administrator on 2017/11/22.
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/user")
    public HttpRes addUser(@RequestBody String data) {

        HttpRes res = new HttpRes();

        JSONObject userJson = JSONObject.parseObject(data);

        User user = new User();

        UUID uuid = UUID.randomUUID();
        user.setId(uuid.toString());
        user.setUsername(userJson.getString("username"));
        user.setPassword(userJson.getString("password"));
        user.setEmail(userJson.getString("phone"));
        user.setPhone(userJson.getString("email"));

        userService.addUser(user);
        res.setState(HttpRes.SUCCESS);
        return res;

    }
}

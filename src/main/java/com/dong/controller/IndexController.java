package com.dong.controller;

import com.alibaba.fastjson.JSONObject;
import com.dong.HttpUtils.HttpRes;
import com.dong.dao.User;
import com.dong.service.UserServiceImpl;
import com.dong.util.JSONParamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/19.
 */
@RestController
public class IndexController
{
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/")
    public HttpRes isLogin()
    {
        HttpRes httpRes = new HttpRes();
        ModelAndView mv = new ModelAndView("login");
        return httpRes;
    }

    @PostMapping("/loginAction")
    public HttpRes login(@RequestBody  String data){
        HttpRes res = new HttpRes();

        JSONObject userData = JSONObject.parseObject(data);

        String username = userData.getString("username");
        String password = userData.getString("password");

        User user = userService.getUser(username);

        if (password.equals(user.getPassword())){
            user.setPassword("******");
            res.setState(HttpRes.SUCCESS);

            List list = new ArrayList();
            list.add(user);
            res.setData(list);
//            indexMv.addObject(res);
            return res;
        }else {
            res.setState(HttpRes.FAILURE);
            res.setErrMsg(" 帐号与密码不匹配");
            return res;
        }

    }
}

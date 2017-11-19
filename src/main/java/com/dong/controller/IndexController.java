package com.dong.controller;

import com.dong.HttpUtils.HttpRes;
import com.dong.dao.User;
import com.dong.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
    public ModelAndView isLogin()
    {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @PostMapping("/login")
    public HttpRes login(String data){
        HttpRes res = new HttpRes();

        String username = "admin";
        User user = userService.getUser(username);
        String password = "123456";
        if (password.equals(user.getPassword())){
            user.setPassword("******");
            res.setState(HttpRes.SUCCESS);

            List list = new ArrayList();
            list.add(user);
            res.setData(list);
        }else {
            res.setState(HttpRes.FAILURE);
            res.setErrMsg(" 帐号与密码不匹配");
        }
        return res;
    }
}

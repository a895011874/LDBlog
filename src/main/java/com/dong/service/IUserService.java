package com.dong.service;

import com.dong.dao.User;

/**
 * Created by Administrator on 2017/11/19.
 */
public interface IUserService
{
    User getUser(String username);
}

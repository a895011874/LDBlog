package com.dong.mapper;

import com.dong.dao.User;

/**
 * Created by Administrator on 2017/11/19.
 */
public interface UserMapper
{
    User getUser(String username);


    void addUser(User user);
}

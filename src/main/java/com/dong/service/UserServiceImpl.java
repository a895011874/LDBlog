package com.dong.service;


import com.dong.dao.User;
import com.dong.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String username) {

        return userMapper.getUser(username);
    }
}

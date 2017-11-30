package com.dong.service;

import com.dong.HttpUtils.HttpRes;
import com.dong.dao.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/18.
 */

public interface IBlogService
{
    List<Blog> getAllBlog(String username);

    HttpRes createBlog(String blogData);

    void deleteBlog(String id);

    Blog getBlogById(String id);
}

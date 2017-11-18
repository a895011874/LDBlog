package com.dong.service;

import com.dong.dao.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/18.
 */

public interface IBlogService
{
    List<Blog> getAllBlog();

    void createBlog(Blog blog);

    void deleteBlog(String id);

    Blog getBlogById(String id);
}

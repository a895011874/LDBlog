package com.dong.service;

import com.dong.dao.Blog;
import com.dong.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Adminin 2017/11/18.
 */
@Service
public class BlogServiceImpl implements IBlogService
{
    @Autowired
    private BlogMapper blogMapper;

    public List<Blog> getAllBlog()
    {
        return blogMapper.getAllBlog();
    }

    @Override
    public void createBlog(Blog blog) {
        blogMapper.createBlog(blog);
    }

    @Override
    public void deleteBlog(String id) {
        blogMapper.deleteBlog(id);
    }

    @Override
    public Blog getBlogById(String id) {

        return blogMapper.getBlogById(id);
    }
}

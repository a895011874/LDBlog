package com.dong.service;

import com.alibaba.fastjson.JSONObject;
import com.dong.HttpUtils.HttpRes;
import com.dong.dao.Blog;
import com.dong.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Adminin 2017/11/18.
 */
@Service
public class BlogServiceImpl implements IBlogService
{
    @Autowired
    private BlogMapper blogMapper;

    public List<Blog> getAllBlog(String username)
    {
        return blogMapper.getAllBlog(username);
    }

    @Override
    public HttpRes createBlog(String blogData) {

        HttpRes res = new HttpRes();
        Blog blog = new Blog();
        JSONObject blogJson = JSONObject.parseObject(blogData);

        HttpRes httpRes = new HttpRes();

        blog.setTitle(blogJson.getString("title"));
        blog.setId(UUID.randomUUID().toString());
        blog.setContent(blogJson.getString("content"));
        blog.setTypeId(8);
        blog.setAuthor(blogJson.getString("username"));
        blogMapper.createBlog(blog);

        httpRes.setState(HttpRes.SUCCESS);
        httpRes.setData(null);
        return res;
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

package com.dong.controller;

import com.alibaba.fastjson.JSONObject;
import com.dong.HttpUtils.HttpRes;
import com.dong.dao.Blog;
import com.dong.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BlogController
{
    @Autowired
    private IBlogService blogService;

    @GetMapping(value = "blogs")
    public HttpRes getAllBlog()
    {

        HttpRes httpRes = new HttpRes();
        List list = new ArrayList();
        httpRes.setState(HttpRes.SUCCESS);

        List<Blog> blogs =  blogService.getAllBlog();
        httpRes.setData(blogs);

        return httpRes;
    }

    @PostMapping(value = "blog")
    public HttpRes createBlog(@RequestBody String data)
    {

        HttpRes res = new HttpRes();


        blogService.createBlog(data);


        return blogService.createBlog(data);
    }

    @DeleteMapping(value ="blog/{id}")
    public HttpRes deleteBlog(@PathVariable("id") String id)
    {
        blogService.deleteBlog(id);
        return null;
    }
}

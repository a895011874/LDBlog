package com.dong.mapper;

import com.dong.dao.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 ed by Administrator on 2017/11/18.
 */

public interface BlogMapper
{

    List<Blog> getAllBlog(String username);

    void createBlog(Blog blog);

    void deleteBlog(String id);

    Blog getBlogById(String id);

}

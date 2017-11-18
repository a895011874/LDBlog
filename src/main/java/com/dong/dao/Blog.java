package com.dong.dao;

/**
 * Created by Administrator on 2017/11/18.
 */
public class Blog
{
    private String id;

    private String title;

    private String content;

    private Integer typeId;

    private String createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return typeId;
    }

    public void setType(Integer typeId) {
        this.typeId = typeId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

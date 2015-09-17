package com.zhw.dorizon.front.pojo.view;

import java.util.List;

/**
 * Created by zhw on 15/9/17.
 */
public class ViewBlogBean {

    private Integer id;
    private String title;
    private String content;
    private String authorAccount;
    private String author;
    private String publishedTime;
    private Integer readCount;

    private List<ViewTypeBean> types;

    private Integer preId;
    private String preTitle;
    private Integer nextId;
    private String nextTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }


    public Integer getPreId() {
        return preId;
    }

    public void setPreId(Integer preId) {
        this.preId = preId;
    }

    public String getPreTitle() {
        return preTitle;
    }

    public void setPreTitle(String preTitle) {
        this.preTitle = preTitle;
    }

    public Integer getNextId() {
        return nextId;
    }

    public void setNextId(Integer nextId) {
        this.nextId = nextId;
    }

    public String getNextTitle() {
        return nextTitle;
    }

    public void setNextTitle(String nextTitle) {

        this.nextTitle = nextTitle;
    }

    public String getAuthorAccount() {
        return authorAccount;
    }

    public void setAuthorAccount(String authorAccount) {
        this.authorAccount = authorAccount;
    }

    public List<ViewTypeBean> getTypes() {
        return types;
    }

    public void setTypes(List<ViewTypeBean> types) {
        this.types = types;
    }
}

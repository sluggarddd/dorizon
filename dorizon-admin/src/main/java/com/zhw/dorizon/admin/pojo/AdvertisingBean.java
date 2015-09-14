package com.zhw.dorizon.admin.pojo;

/**
 * Created by zhw on 15/9/14.
 */
public class AdvertisingBean {

    private Integer id;
    private String name;
    private String createUser;
    private String modifyUser;
    private Long modifyTime;
    private Long createTime;
    private String url;
    private Integer adTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getAdTypeId() {
        return adTypeId;
    }

    public void setAdTypeId(Integer adTypeId) {
        this.adTypeId = adTypeId;
    }
}

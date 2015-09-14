package com.zhw.dorizon.admin.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zhw.dorizon.admin.pojo.BlogBean;

import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
public interface BlogService {

    public Integer save(BlogBean blogBean) throws Exception;

    public Integer update(BlogBean blogBean) throws Exception;

    public Integer listView(Map<String, Object> params, Integer page, Integer limit) throws Exception;

    public Boolean validate(BlogBean blogBean) throws Exception;

}

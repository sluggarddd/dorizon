package com.zhw.dorizon.admin.service;

import com.zhw.dorizon.admin.pojo.BlogTypeBean;

import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
public interface BlogTypeService {

    public Integer add(BlogTypeBean blogTypeBean, String username) throws Exception;

    public Integer update(String name, String description, Integer id, String username) throws Exception;

    public List<BlogTypeBean> list(Map<String, Object> params, Integer page, Integer limit) throws Exception;


}

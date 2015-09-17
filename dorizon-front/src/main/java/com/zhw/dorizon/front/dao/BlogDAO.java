package com.zhw.dorizon.front.dao;

import com.zhw.dorizon.common.dao.BaseDAO;
import com.zhw.dorizon.front.pojo.view.ViewBlogBean;

import java.util.Map;

/**
 * Created by zhw on 15/9/15.
 */
public interface BlogDAO extends BaseDAO {

    public ViewBlogBean listView(Map<String, Object> params) throws Exception;
}

package com.zhw.dorizon.admin.dao;

import com.zhw.dorizon.admin.pojo.AdminBean;
import com.zhw.dorizon.admin.pojo.view.ViewAdminBean;
import com.zhw.dorizon.common.dao.BaseDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by zhanghw on 2015/8/17.
 */

public interface AdminDAO extends BaseDAO<AdminBean> {

    public List<ViewAdminBean> listView(Map<String, Object> params) throws Exception;
}

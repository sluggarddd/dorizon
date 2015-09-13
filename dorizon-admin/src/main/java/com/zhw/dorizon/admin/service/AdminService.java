package com.zhw.dorizon.admin.service;

import com.zhw.dorizon.admin.pojo.AdminBean;
import com.zhw.dorizon.admin.pojo.view.ViewAdminBean;

import java.util.List;
import java.util.Map;

/**
 * Created by zhanghw on 2015/8/17.
 */
public interface AdminService {

    public void save(AdminBean adminBean) throws Exception;

    public void save(String username, String password, String nickname, String mobile, String email) throws Exception;

    public List<ViewAdminBean> list(Map<String, Object> params,Integer page,Integer limit) throws Exception;

}

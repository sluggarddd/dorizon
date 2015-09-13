package com.zhw.dorizon.admin.service.impl;

import com.zhw.dorizon.admin.dao.AdminDAO;
import com.zhw.dorizon.admin.pojo.AdminBean;
import com.zhw.dorizon.admin.pojo.view.ViewAdminBean;
import com.zhw.dorizon.admin.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhanghw on 2015/8/17.
 */
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminDAO adminDAO;


    @Override
    public void save(AdminBean adminBean) throws Exception {

        adminDAO.save(adminBean);
    }

    @Override
    public void save(String username, String password, String nickname, String mobile, String email) throws Exception {


        AdminBean adminBean = new AdminBean();
        adminBean.setUsername(username);
        adminBean.setPassword(password);
        adminBean.setNickname(nickname);
        adminBean.setMobile(mobile);
        adminBean.setEmail(email);
        adminBean.setRegisterTime(System.currentTimeMillis());

        save(adminBean);


    }

    @Override
    public List<ViewAdminBean> list(Map<String, Object> params, Integer page, Integer limit) throws Exception {
        if (page != null && limit != null) {
            params.put("offset", page * limit);
            params.put("limit", limit);
        } else {
            params.put("offset", 0);
            params.put("limit", 10);
        }

        return adminDAO.listView(params);
    }
}

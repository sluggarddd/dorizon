package com.zhw.admin.service.impl;

import com.zhw.admin.dao.AdminDAO;
import com.zhw.admin.pojo.AdminBean;
import com.zhw.admin.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhanghw on 2015/8/17.
 */
@Service("AdminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminDAO adminDAO;


    @Override
    public void add(AdminBean adminBean) throws Exception {

        adminDAO.save(adminBean);
    }
}

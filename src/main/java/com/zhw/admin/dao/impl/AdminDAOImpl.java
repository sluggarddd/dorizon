package com.zhw.admin.dao.impl;

import com.zhw.admin.dao.AdminDAO;
import com.zhw.admin.pojo.AdminBean;
import com.zhw.common.dao.impl.BaseDAOImpl;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by zhanghw on 2015/8/17.
 */
@Repository("adminDAO")
@Transactional
public class AdminDAOImpl extends BaseDAOImpl<AdminBean>
        implements AdminDAO {
}

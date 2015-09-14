package com.zhw.dorizon.admin.service.impl;

import com.zhw.dorizon.admin.dao.BlogDAO;
import com.zhw.dorizon.admin.pojo.BlogBean;
import com.zhw.dorizon.admin.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
@Service("BlogService")
public class BlogServiceImpl implements BlogService {

    @Resource
    BlogDAO blogDAO;

    @Override
    public Integer save(BlogBean blogBean) throws Exception {

        return blogDAO.save(blogBean);
    }

    @Override
    public Integer update(BlogBean blogBean) throws Exception {
        return null;
    }

    @Override
    public Integer listView(Map<String, Object> params, Integer page, Integer limit) throws Exception {
        return null;
    }

    @Override
    public Boolean validate(BlogBean blogBean) throws Exception {

        if (blogBean == null) {
            return false;
        }

        if (blogBean.getContent() == null ||
                blogBean.getTitle() == null) {
            return false;
        }

        return true;
    }
}

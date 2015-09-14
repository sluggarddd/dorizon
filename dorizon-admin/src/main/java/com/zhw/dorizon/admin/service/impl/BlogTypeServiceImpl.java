package com.zhw.dorizon.admin.service.impl;

import com.zhw.dorizon.admin.dao.BlogTypeDAO;
import com.zhw.dorizon.admin.pojo.BlogTypeBean;
import com.zhw.dorizon.admin.service.BlogTypeService;
import com.zhw.dorizon.common.config.PageConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
@Service("BlogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

    @Resource
    BlogTypeDAO blogTypeDAO;

    @Override
    public Integer add(BlogTypeBean blogTypeBean, String username) throws Exception {

        blogTypeBean.setCreateTime(System.currentTimeMillis());
        blogTypeBean.setCreateUser(username);

        return blogTypeDAO.save(blogTypeBean);

    }

    @Override
    public Integer update(String name, String description, Integer id, String username) throws Exception {

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", name);
        params.put("description", description);
        params.put("modifyUser", username);
        params.put("modifyTime", System.currentTimeMillis());

        return blogTypeDAO.update(params);
    }

    @Override
    public List<BlogTypeBean> list(Map<String, Object> params, Integer page, Integer limit)throws Exception{
        if (page != null && limit != null) {
            params.put("offset", page * limit);
            params.put("limit", limit);
        } else {
            params.put("offset", 0);
            params.put("limit", PageConfig.LIMIT);
        }
        return blogTypeDAO.list(params);
    }


}

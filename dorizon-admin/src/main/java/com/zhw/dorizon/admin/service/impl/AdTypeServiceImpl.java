package com.zhw.dorizon.admin.service.impl;

import com.zhw.dorizon.admin.dao.AdTypeDAO;
import com.zhw.dorizon.admin.pojo.AdvertisingTypeBean;
import com.zhw.dorizon.admin.service.AdTypeService;
import com.zhw.dorizon.common.config.PageConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
@Service("AdTypeService")
public class AdTypeServiceImpl implements AdTypeService {

    @Resource
    AdTypeDAO adTypeDAO;


    @Override
    public List<AdvertisingTypeBean> list(Map<String, Object> params, Integer page, Integer limit) throws Exception {

        if (page != null && limit != null) {
            params.put("offset", page * limit);
            params.put("limit", limit);
        } else {
            params.put("offset", 0);
            params.put("limit", PageConfig.LIMIT);
        }

        return adTypeDAO.list(params);
    }
}

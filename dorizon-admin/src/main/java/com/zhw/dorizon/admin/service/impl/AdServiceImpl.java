package com.zhw.dorizon.admin.service.impl;

import com.zhw.dorizon.admin.dao.AdDAO;
import com.zhw.dorizon.admin.pojo.AdvertisingBean;
import com.zhw.dorizon.admin.pojo.AdvertisingTypeBean;
import com.zhw.dorizon.admin.service.AdService;
import com.zhw.dorizon.common.config.PageConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
@Service("AdService")
public class AdServiceImpl implements AdService {


    @Resource
    AdDAO adDAO;

    @Override
    public List<AdvertisingBean> list(Map<String, Object> params, Integer page, Integer limit) throws Exception {

        if (page != null && limit != null) {
            params.put("offset", page * limit);
            params.put("limit", limit);
        } else {
            params.put("offset", 0);
            params.put("limit", PageConfig.LIMIT);
        }

        return adDAO.list(params);
    }
}

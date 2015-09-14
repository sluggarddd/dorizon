package com.zhw.dorizon.admin.service;

import com.zhw.dorizon.admin.pojo.AdvertisingTypeBean;

import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
public interface AdTypeService {

    public List<AdvertisingTypeBean> list(Map<String, Object> params, Integer page, Integer limit) throws Exception;
}

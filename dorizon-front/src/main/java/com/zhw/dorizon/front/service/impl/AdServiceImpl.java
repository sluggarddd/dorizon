package com.zhw.dorizon.front.service.impl;

import com.zhw.dorizon.front.dao.AdDAO;
import com.zhw.dorizon.front.service.AdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhw on 15/9/17.
 */
@Service("AdService")
public class AdServiceImpl implements AdService {

    @Resource
    AdDAO adDAO;
}

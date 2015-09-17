package com.zhw.dorizon.front.service.impl;

import com.zhw.dorizon.front.dao.BlogTypeDAO;
import com.zhw.dorizon.front.service.BlogTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhw on 15/9/17.
 */
@Service("BlogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {


    @Resource
    BlogTypeDAO blogTypeDAO;
}

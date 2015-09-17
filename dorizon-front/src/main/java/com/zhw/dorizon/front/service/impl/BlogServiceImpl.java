package com.zhw.dorizon.front.service.impl;

import com.zhw.dorizon.front.dao.BlogDAO;
import com.zhw.dorizon.front.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhw on 15/9/17.
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Resource
    BlogDAO blogDAO;

}

package com.zhw.dorizon.admin.action;

import com.zhw.dorizon.admin.service.AdminService;
import com.zhw.dorizon.common.action.BaseAction;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


/**
 * Created by zhanghw on 2015/8/16.
 */

@Controller
@RequestMapping("/")
public class IndexAction extends BaseAction {

    private Logger logger = Logger.getLogger(IndexAction.class);

    @Resource
    AdminService adminService;

    @RequestMapping("/test")
    public ModelAndView get() throws Exception {

//        System.out.println("asda");
        ModelAndView mav = mav();
        mav.addObject("hello", "zhw");
        mav.setViewName("dorizon/home/test");


        return mav;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView index() throws Exception {

        ModelAndView mav = mav();
        mav.setViewName("index");

        return mav;

    }

}

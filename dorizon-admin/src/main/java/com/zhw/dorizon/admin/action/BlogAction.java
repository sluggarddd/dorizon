package com.zhw.dorizon.admin.action;

import com.zhw.dorizon.admin.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by zhw on 15/9/14.
 */
@Controller
@RequestMapping("/blog")
public class BlogAction {

    @Resource
    BlogService blogService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam(value = "page", required = false) Integer pageId,
                             @RequestParam(value = "limit", required = false) Integer limit) throws Exception {

        return null;

    }
}

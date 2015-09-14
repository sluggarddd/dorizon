package com.zhw.dorizon.admin.action;

import com.zhw.dorizon.admin.pojo.BlogTypeBean;
import com.zhw.dorizon.admin.service.BlogTypeService;
import com.zhw.dorizon.common.action.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/14.
 */
@Controller
@RequestMapping("/type/blog")
public class BlogTypeAction extends BaseAction {


    @Resource
    BlogTypeService blogTypeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam(value = "page", required = false) Integer page,
                             @RequestParam(value = "limit", required = false) Integer limit) throws Exception {


        Map<String, Object> params = new HashMap<String, Object>();

        List<BlogTypeBean> dataList = blogTypeService.list(params, page, limit);

        ModelAndView mav = mav();
        mav.addObject("items", dataList);
        mav.setViewName("blog-type/index");

        return mav;


    }
}

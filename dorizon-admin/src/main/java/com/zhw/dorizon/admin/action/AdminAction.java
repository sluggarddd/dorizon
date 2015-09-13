package com.zhw.dorizon.admin.action;

import com.zhw.dorizon.admin.pojo.view.ViewAdminBean;
import com.zhw.dorizon.admin.service.AdminService;
import com.zhw.dorizon.common.action.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by zhanghw on 2015/9/13.
 */
@Controller
@RequestMapping("/admin")
public class AdminAction extends BaseAction {


    @Resource
    AdminService adminService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam(value = "page", required = false) Integer page,
                             @RequestParam(value = "limit", required = false) Integer limit) throws Exception {

        Map<String, Object> params = new HashMap<String, Object>();

        List<ViewAdminBean> dataList = adminService.list(params, page, limit);

        if (dataList == null) {
            dataList = new ArrayList<ViewAdminBean>();
        }
        ModelAndView mav = mav();

        mav.addObject("items", dataList);
        mav.setViewName("admin/admin/index");

        return mav;


    }


}

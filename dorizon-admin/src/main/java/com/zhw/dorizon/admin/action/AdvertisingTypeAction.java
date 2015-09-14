package com.zhw.dorizon.admin.action;

import com.zhw.dorizon.admin.pojo.AdvertisingTypeBean;
import com.zhw.dorizon.admin.service.AdTypeService;
import com.zhw.dorizon.common.action.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhanghw on 2015/9/14.
 */
@Controller
@RequestMapping("/type/ad")
public class AdvertisingTypeAction extends BaseAction {

    @Resource
    AdTypeService adTypeService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView list(@RequestParam(value = "page", required = false) Integer page,
                             @RequestParam(value = "limit", required = false) Integer limit) throws Exception {

        Map<String, Object> params = new HashMap<String, Object>();

        List<AdvertisingTypeBean> dataList = adTypeService.list(params, page, limit);
        if (dataList == null) {
            dataList = new ArrayList<AdvertisingTypeBean>();
        }

        ModelAndView mav = mav();


        mav.addObject("items", dataList);
        mav.setViewName("/ad-type/index");

        return mav;
    }


}

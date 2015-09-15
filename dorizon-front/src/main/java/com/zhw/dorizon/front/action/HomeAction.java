package com.zhw.dorizon.front.action;

import com.zhw.dorizon.common.action.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhw on 15/9/15.
 */
@Controller
@RequestMapping({"", "/", "/index"})
public class HomeAction extends BaseAction {


    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView home() throws Exception {

        ModelAndView mav = mav();
        mav.setViewName("/index");
        return mav;

    }
}

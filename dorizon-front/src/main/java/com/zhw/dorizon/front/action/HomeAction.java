package com.zhw.dorizon.front.action;

import com.zhw.dorizon.common.action.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() throws Exception {

        ModelAndView mav = mav();
        mav.setViewName("/list");
        return mav;

    }


    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public ModelAndView get() throws Exception {

        ModelAndView mav = mav();

        mav.setViewName("/detail");
        return mav;
    }


    @RequestMapping(value = "/{type}", method = RequestMethod.GET)
    public ModelAndView listByType(@PathVariable("type") String type) {

        ModelAndView mav = mav();
        mav.setViewName("/list");
        return mav;

    }


    @RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
    public ModelAndView getById(@PathVariable("id") Integer id) throws Exception {

        ModelAndView mav = mav();
        mav.setViewName("/detail");
        return mav;

    }

}

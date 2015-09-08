package com.zhw.common.support.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhanghw on 2015/8/23.
 */
public class JspUtils {
    /**
     *
     * http://www.falvshuo.com
     * @param request
     * @return
     */
    public static String getProjectBaseUrl(HttpServletRequest request){
        String path = request.getContextPath();
        int port =request.getServerPort();
        String basePath = request.getScheme()+"://"+request.getServerName();
        if(port!=80){
            basePath=basePath+":"+request.getServerPort();
        }
        basePath=basePath+path;
        return basePath;
    }
}

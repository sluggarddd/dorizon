package com.zhw.dorizon.front.dao;

import com.zhw.dorizon.common.dao.BaseDAO;
import com.zhw.dorizon.front.pojo.view.ViewTypeBean;

import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/17.
 */
public interface BlogTypeDAO extends BaseDAO {

    public List<ViewTypeBean> listView(Map<String, Object> params) throws Exception;

}

package com.zhw.dorizon.common.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by zhw on 15/9/15.
 */
public interface BaseDAO<T> {

    public List<T> list(Map<String, Object> params) throws Exception;

    public T get(Map<String,Object>params)throws Exception;

}

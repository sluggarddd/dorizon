package com.zhw.dorizon.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by zhanghw on 2015/8/17.
 */
public interface BaseDAO<T> {


    public Integer save(T t) throws Exception;

    public Integer update(T t) throws Exception;

    public Integer update(Map<String, Object> params) throws Exception;

    public Integer delete(Map<String, Object> params) throws Exception;

    public T get(Map<String, Object> params) throws Exception;

    public List<T> list(Map<String, Object> params) throws Exception;

}

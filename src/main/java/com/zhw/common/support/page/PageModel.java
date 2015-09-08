package com.zhw.common.support.page;

import java.util.List;

/**
 * Created by zhanghw on 2015/8/19.
 */
public class PageModel<E> {

    //结果集
    private List<E> dataList;

    //查询记录数
    private int totalRecords;

    //每页多少页数据
    private int pageSize;

    //第几页
    private int pageNo;

    /**
     * 总页数
     * @return
     */
    public int getTotalPages(){
        return (totalRecords + pageSize -1) / pageSize;
    }

    /**
     * 获取首页
     * @return
     */
    public int getTopPage(){
        return 1;
    }


    /**
     * 上一页
     * @return
     */
    public int getPreviousPageNo(){
        if(pageNo <= 1){
            return 1;
        }
        return pageNo -1;
    }

    /**
     * 下一页
     * @return
     */
    public int getNextPageNo() {
        if (pageNo >= getBottomPageNo()) {
            return getBottomPageNo();
        }
        return pageNo + 1;
    }

    /**
     * 取得尾页
     * @return
     */
    public int getBottomPageNo() {
        return getTotalPages();
    }


    public List<E> getDataList() {
        return dataList;
    }

    public void setDataList(List<E> dataList) {
        this.dataList = dataList;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
}

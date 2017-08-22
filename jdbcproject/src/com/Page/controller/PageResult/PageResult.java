package com.Page.controller.PageResult;

import java.util.List;

public class PageResult {
    //分页结果集对象，封装了所有分页信息
    private List listData; //当前页的结果集，通过sql查询出来
    private Integer totalCount; //结果集总数，通过sql查询出来

    private Integer currentPage = 1; //用户传入 当前页
    private Integer pageSize = 10;  //用户传入 每页显示多少条数据

    private Integer beginPage = 1;//首页
    private Integer prePage; //上页

    private Integer nextPage;//下页
    private Integer totalPage;//末页/总页

    public PageResult(List listData, Integer totalCount, Integer currentPage, Integer pageSize) {
        this.listData = listData;
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        //-------------------------------------------------
        this.totalPage = this.totalCount % this.pageSize == 0?
                this.totalCount/this.pageSize : this.totalCount /this.pageSize +1;

        this.prePage = this.currentPage-1>=1? this.currentPage-1:1;
        this.nextPage = this.currentPage+1<=this.totalPage?this.currentPage+1:this.totalPage;
    }


    public List getListData() {
        return listData;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getBeginPage() {
        return beginPage;
    }

    public Integer getPrePage() {
        return prePage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

}

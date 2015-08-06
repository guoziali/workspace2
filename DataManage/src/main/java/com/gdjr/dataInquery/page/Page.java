package com.gdjr.dataInquery.page;

/**
 * Created by lisongli on 15/8/5.
 */
public class Page{
    //开始记录数
    private Integer pageIndex=0;
    //页容量
    private Integer pageSize=1;
    //页码
    private Integer page=1;
    //总行数
    private Integer lines;
    //总页数
    private Integer pages;
    public Integer getPageIndex() {
        return (getPage()-1)*pageSize;
    }
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getPage() {
        if(page<0){
            return 1;
        }else if(page>getPages()){
            return pages;
        }else{
            return page;
        }
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Integer getLines() {
        return lines;
    }
    public void setLines(Integer lines) {
        this.lines = lines;
    }
    public Integer getPages() {
        if(lines%pageSize==0){
            return lines/pageSize;
        }else{
            return lines/pageSize+1;
        }
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
}

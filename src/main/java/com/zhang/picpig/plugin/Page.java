package com.zhang.picpig.plugin;


import com.zhang.picpig.util.ParameterMap;

public class Page {
    private int showCount;
    private int totalPage;
    private int totalResult;
    private int currentResult;
    private int currentPage;
    private boolean entityOrField;
    private ParameterMap pm = new ParameterMap();

    public int getShowCount() {
        return showCount;
    }

    public void setShowCount(int showCount) {
        this.showCount = showCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public int getCurrentResult() {
        return currentResult;
    }

    public void setCurrentResult(int currentResult) {
        this.currentResult = currentResult;
    }

    public boolean isEntityOrField() {
        return entityOrField;
    }

    public void setEntityOrField(boolean entityOrField) {
        this.entityOrField = entityOrField;
    }

    public ParameterMap getPm() {
        return pm;
    }

    public void setPm(ParameterMap pm) {
        this.pm = pm;
    }
}

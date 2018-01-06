package com.zhang.picpig.plugin;

public interface PageConstants {

    // 每页显示记录数的key
    public static final String SHOW_COUNT_KEY = "rows";
    /**
     * 当前页
     */
    public static final String CURRENT_PAGE_KEY = "page";
    //总页数
    public static final String TOTAL_PAGE_KEY = "totalPage";
    //总记录数
    public static final String TOTAL_RESULT_KEY = "totalResult";
    // 当前记录起始索引
    public static final String CURRENT_RESULT_KEY = "currentResult";

    //初始化当前页
    public static final Integer INIT_CURRENT_PAGE = 1;
    //初始化每页显示的个数
    public static final Integer INIT_SHOW_COUNT = 20;

    public static int getTotalPage(Integer totalResult, Integer showCount) {
        int totalPage = 0;
        if (totalResult % showCount == 0) {
            totalPage = totalResult / showCount;
        } else {
            totalPage = totalResult / showCount + 1;
        }
        return totalPage;
    }
}

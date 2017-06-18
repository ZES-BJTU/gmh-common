package com.zes.squad.gmh.common.entity;

import java.io.Serializable;
import java.util.List;

import com.google.common.collect.Lists;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PagedList<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer           pageNum;
    private Integer           pageSize;
    private Long              totalCount;
    private Integer           totalPages;
    private List<T>           data;

    public static <T> PagedList<T> newMe(List<T> data) {
        PagedList<T> pageList = new PagedList<>();
        pageList.pageNum = 1;
        pageList.pageSize = 10;
        pageList.totalCount = 0L;
        pageList.totalPages = 0;
        pageList.data = data;
        return pageList;
    }

    public static <T> PagedList<T> newMe(int pageNum, int pageSize, long totalCount, List<T> data) {
        PagedList<T> pageList = new PagedList<>();
        pageList.pageNum = pageNum;
        pageList.pageSize = pageSize;
        pageList.totalCount = totalCount;
        pageList.totalPages = (int) Math.ceil(((double) totalCount) / pageSize);
        if (data != null) {
            pageList.data = data;
        } else {
            pageList.data = Lists.newArrayList();
        }
        return pageList;
    }

}

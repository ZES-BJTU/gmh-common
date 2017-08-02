package com.zes.squad.gmh.common.entity;

import java.util.List;

import com.google.common.collect.Lists;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PagedLists {

    public static <T> PagedList<T> newPagedList(int pageNum, int pageSize) {
        PagedList<T> pagedList = new PagedList<>();
        pagedList.setPageNum(pageNum);
        pagedList.setPageSize(pageSize);
        pagedList.setTotalCount(0L);
        pagedList.setTotalPages(1);
        pagedList.setData(Lists.newArrayList());
        return pagedList;
    }

    public static <T> PagedList<T> newPagedList(int pageNum, int pageSize, long totalCount, List<T> data) {
        PagedList<T> pagedList = new PagedList<>();
        pagedList.setPageNum(pageNum);
        pagedList.setPageSize(pageSize);
        pagedList.setTotalCount(totalCount);
        pagedList.setTotalPages((int) Math.ceil(((double) totalCount) / pageSize));
        pagedList.setData(data == null ? Lists.newArrayList() : data);
        return pagedList;
    }

}

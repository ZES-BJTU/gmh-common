package com.zes.squad.gmh.common.entity;

import java.util.List;

import com.google.common.collect.Lists;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PagedLists {

    public static <T> PagedList<T> newPagedList(int pageNum, int pageSize) {
        PagedList<T> pagedList = new PagedList<>();
        pagedList.setPageNum(pageNum).setPageSize(pageSize).setTotalCount(0L).setData(Lists.newArrayList());
        return pagedList;
    }

    public static <T> PagedList<T> newPagedList(int pageNum, int pageSize, long totalCount, List<T> data) {
        PagedList<T> pagedList = new PagedList<>();
        pagedList.setPageNum(pageNum).setPageSize(pageSize).setTotalCount(totalCount)
                .setData(data == null ? Lists.newArrayList() : data);
        return pagedList;
    }

}

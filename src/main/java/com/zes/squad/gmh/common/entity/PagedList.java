package com.zes.squad.gmh.common.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class PagedList<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer           pageNum;
    private Integer           pageSize;
    private Long              totalCount;
    private Integer           totalPages;
    private List<T>           data;

}

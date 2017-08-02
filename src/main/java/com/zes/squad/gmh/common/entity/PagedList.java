package com.zes.squad.gmh.common.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Accessors(chain = true)
public class PagedList<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer           pageNum;
    private Integer           pageSize;
    private Long              totalCount;
    private Integer           totalPages;
    private List<T>           data;
    
}

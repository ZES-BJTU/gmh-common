package com.zes.squad.gmh.common.converter;

import java.util.List;

import com.google.common.collect.Lists;
import com.zes.squad.gmh.common.entity.PagedList;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommonConverter {

    private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    private static MapperFacade  mapperFacade  = null;

    static {
        mapperFacade = CommonConverter.mapperFactory.getMapperFacade();
    }

    public static MapperFacade getMapperFacade() {
        return mapperFacade;
    }

    public static <T> T map(Object sourceObject, Class<T> targetClass) {
        return mapperFacade.map(sourceObject, targetClass);
    }

    public static <T> List<T> mapList(List<?> sourceObjects, Class<T> targetClass) {
        if (sourceObjects == null) {
            return null;
        }
        List<T> mapListResult = Lists.newArrayList();
        if (sourceObjects.isEmpty()) {
            return mapListResult;
        }
        for (int i = 0; i < sourceObjects.size(); i++) {
            mapListResult.add(CommonConverter.map(sourceObjects.get(i), targetClass));
        }
        return mapListResult;
    }

    public static <T> PagedList<T> mapPageList(PagedList<?> sourcePagedObjects, Class<T> targetClass) {
        if (sourcePagedObjects == null) {
            return null;
        }
        if (sourcePagedObjects.getData() == null) {
            PagedList.newMe(null);
        }
        if (sourcePagedObjects.getData().isEmpty()) {
            return PagedList.newMe(Lists.newArrayList());
        }
        return PagedList.newMe(sourcePagedObjects.getPageNum(), sourcePagedObjects.getPageSize(),
                sourcePagedObjects.getTotalCount(), CommonConverter.mapList(sourcePagedObjects.getData(), targetClass));
    }

}

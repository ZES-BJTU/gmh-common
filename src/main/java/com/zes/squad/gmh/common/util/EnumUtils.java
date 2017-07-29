package com.zes.squad.gmh.common.util;

import org.apache.commons.beanutils.PropertyUtils;

import com.zes.squad.gmh.common.exception.ErrorCodeEnum;
import com.zes.squad.gmh.common.exception.GmhException;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EnumUtils {

    public static <K, T> String getDescByKey(Class<T> clazz, K key) {
        if (!clazz.isEnum()) {
            throw new GmhException(ErrorCodeEnum.BUSINESS_EXCEPTION_INVALID_PARAMETERS.getCode(),
                    clazz.getName() + " is not an enum class.");
        }
        T[] enumConsts = clazz.getEnumConstants();
        Object enumKey = null;
        Object enumDesc = null;
        try {
            for (T ec : enumConsts) {
                enumKey = PropertyUtils.getProperty(ec, "key");
                enumDesc = PropertyUtils.getProperty(ec, "desc");
                if (enumKey != null && enumKey.equals(key)) {
                    return String.valueOf(enumDesc);
                }
            }
        } catch (Exception e) {
            log.error("根据枚举key获取枚举值异常, enum class is {}, key is {}, exception is ", clazz.getName(), key, e);
        }
        return null;
    }

}

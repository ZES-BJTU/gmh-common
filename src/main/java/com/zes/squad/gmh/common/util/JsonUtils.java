package com.zes.squad.gmh.common.util;

import com.google.gson.Gson;

public class JsonUtils {

    /**
     * 序列化为json
     * 
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        Gson gson = new Gson();
        String jsonData = gson.toJson(obj);
        return jsonData;
    }

    /**
     * 反序列化json
     * 
     * @param jsonData
     * @param clazz
     * @return
     */
    public static <T> T parseJson(String jsonData, Class<T> clazz) {
        Gson gson = new Gson();
        T obj = gson.fromJson(jsonData, clazz);
        return obj;
    }

}

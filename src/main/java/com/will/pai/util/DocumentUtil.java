package com.will.pai.util;

import com.alibaba.fastjson.JSON;
import org.bson.Document;


public class DocumentUtil {
    public static  <T> Document fromBean(T bean) {
        if (bean instanceof Document){
            return (Document) bean;
        }
        return Document.parse(JSON.toJSONString(bean));
    }

}

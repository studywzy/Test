package com.Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Wzy
 * @date 2020-02-20 - 20:29
 *
 * Map使用泛型
 */
public class GenericTest03 {

    public static void main(String[] args) {

        Map<String,Integer> maps = new HashMap<>();

        //添加元素
        maps.put("西瓜",10);
        maps.put("苹果",9);
        maps.put("香蕉",20);

        //遍历
        Set<String> keys = maps.keySet();

        Iterator<String> it = keys.iterator();

        while (it.hasNext()){

            String k = it.next();

            Integer v =maps.get(k);

            System.out.println(k + "-->" + v);

        }
    }
}

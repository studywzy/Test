package com.Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Wzy
 * @date 2020-02-20 - 20:12
 *
 * 2.泛型语法如何实现
 */
public class GenericTest02 {

    public static void main(String[] args) {
        //创建一个List集合，只能存储字符串类型
        //JDK1.7之后后面的菱形框可以不写类型
        List<String> s = new ArrayList<>();

        //添加元素
        //s.add(1);Error,只能添加String类型

        s.add("JACK");
        s.add("SUN");
        s.add("KING");
        s.add("SMITH");

        //遍历
        Iterator<String> it = s.iterator();

        while(it.hasNext()){
            String a = it.next();
            System.out.println(a);
        }

    }
}

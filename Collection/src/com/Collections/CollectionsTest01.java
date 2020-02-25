package com.Collections;

import java.util.*;

/**
 * @author Wzy
 * @date 2020-02-20 - 15:42
 *
 * 关于集合工具类 java.util.Collections; 这是一个类
 * java.util.Collection; 这是一个接口
 */
public class CollectionsTest01 {

    public static void main(String[] args) {

        //使用Collectons工具完成集合的排序
        List l = new ArrayList();

        //添加元素
        l.add(10);
        l.add(5);
        l.add(9);
        l.add(20);
        l.add(30);

        //遍历
        for(int i = 0;i < l.size();i ++){
            System.out.println(l.get(i));
        }

        //排序
        Collections.sort(l);//只能对List类型排序，元素必须是可比较的，实现Comparable接口
        // 或者创建集合的时候使用比较器Comparator

        System.out.println("------------");

        for(int i = 0;i < l.size();i ++){
            System.out.println(l.get(i));
        }

        //创建Set集合
        Set s = new HashSet();

        s.add(10);
        s.add(9);
        s.add(8);
        s.add(7);

        //将Set集合转为List集合
        List listS = new ArrayList(s);

        Collections.sort(listS);

        System.out.println("------------");

        for(int i = 0;i < listS.size();i ++){

            System.out.println(listS.get(i));
        }

    }
}

package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Wzy
 * @date 2020-02-19 - 16:44
 * 深入List集合
 * ArrayList集合底层是数组，所以ArrayList有很多自己的特性
 *
 * ArrayList默认初始化容量是10，扩大后的容量是原容量的1.5倍
 * Vector集合底层默认初始化容量也是10，但扩大后的容量是原容量的2倍
 *
 * 如何优化ArrayList和Vector
 *      尽量减少扩容操作，扩容需要数组拷贝，拷贝很费内存
 *      一般推荐在创建集合的时候指定初始化容量
 */
public class ListTest02 {

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(123);
        l.add(321);
        l.add(69);


        for(int i = 0;i < l.size();i ++){

            System.out.println(l.get(i));
        }

        l.add(1,555);

        //取得第一个元素
        System.out.println(l.get(0));

        //遍历List集合特有的遍历方式
        for(int i = 0;i < l.size();i ++){

            System.out.println(l.get(i));
        }

        //迭代器也可以
        Iterator it = l.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}

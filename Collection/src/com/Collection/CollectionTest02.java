package com.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Wzy
 * @date 2020-02-19 - 11:54
 *
 * Iterator iterator(); 获取集合所依赖的迭代器对象
 * 通过迭代器中的方法完成集合的迭代（遍历）
 *
 * 这种方式是所有集合通用的遍历方式
 */
public class CollectionTest02 {

    public static void main(String[] args) {

        //创建集合对象
        Collection c = new LinkedList();

        //添加元素
        c.add(100);
        c.add(3.14);
        c.add(false);

        //迭代，遍历
        //不需要关心底层集合的具体类型，所有集合依赖的迭代器都实现了java.util.Iterator;接口


        /*使用while循环
        Iterator it = c.iterator();//获取迭代器对象,迭代器是面向接口编程
        while(it.hasNext()){//原则：调用next();之前必须要调用hasnext();

            Object element = it.next();

            System.out.println(element);//100 3.14 false
        }
        */
        //使用for循环
        for(Iterator it = c.iterator();it.hasNext();) {

            Object element = it.next();

            System.out.println(element);//100 3.14 false
        }

    }
}

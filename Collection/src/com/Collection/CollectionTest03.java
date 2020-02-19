package com.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Wzy
 * @date 2020-02-19 - 12:22
 *
 * boolean contains(Object o); 判断集合中是否有某个元素
 *
 * boolean remove(Object o); 从集合中移除某个元素
 *
 * remove和contain方法都需要集合中的元素应该去重写equals方法
 * 因为Objict的equals方法比较的是内存地址，不符合现实需求
 */
public class CollectionTest03 {

    public static void main(String[] args) {

        Collection c = new ArrayList();

        Integer i1 = 10;

        Integer i2 = 10;

        c.add(i1);

        System.out.println(c.contains(i1));//ture

        //ArrayList重写了equals方法
        //contains方法底层调用的是equals方法，如果equals方法返回ture，就是包含
        System.out.println(c.contains(i2));//ture

        //remove方法底层调用的也是equals方法
        c.remove(i2);

        System.out.println(c.contains(i1));//false

    }
}

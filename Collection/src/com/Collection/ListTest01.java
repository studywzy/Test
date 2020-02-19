package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Wzy
 * @date 2020-02-19 - 16:39
 *
 * List集合存储元素特点：
 *      1.有序（List集合中存储有下标）：存进去是什么顺序，取出来还是什么顺序
 *      2.存储的元素可重复
 */
public class ListTest01 {

    public static void main(String[] args) {

        List l = new ArrayList();

        l.add(10);
        l.add(100);
        l.add(20);
        l.add(30);
        l.add(30);

        //获取迭代器对象
        Iterator it = l.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}

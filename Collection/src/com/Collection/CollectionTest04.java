package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Wzy
 * @date 2020-02-19 - 12:51
 *
 * 深入remove方法
 *      1.迭代器的remove方法
 *      2.集合自身带的remove方法
 */
public class CollectionTest04 {

    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add(1);
        c.add(2);
        c.add(4);

        Iterator it = c.iterator();

        while(it.hasNext()){

            //推荐使用迭代器自身带的remove方法删除元素
            it.next();

            it.remove();

            /*
            使用集合自身的remove方法,删除一个元素后集合就变了，
            迭代器需要重新生成,否则it.next();会报异常
            Object element = it.next();
            //删除
            c.remove(element);
             */
        }
    }

}

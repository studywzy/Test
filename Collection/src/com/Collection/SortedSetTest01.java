package com.Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Wzy
 * @date 2020-02-20 - 11:25
 * java.util.Set;
 *      java.util.SortedSet;无序不可重复，但是存进去的元素可以按照元素大小顺序从小到大自动排列
 *          java.util.TreeSet;
 */
public class SortedSetTest01 {

    public static void main(String[] args) {

        SortedSet ss = new TreeSet();

        ss.add(10);//自动装箱
        ss.add(20);
        ss.add(5);
        ss.add(3);
        ss.add(50);

        Iterator it = ss.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }

        //String
        SortedSet strs = new TreeSet();
        strs.add("JACK");
        strs.add("JSON");
        strs.add("MARY");
        strs.add("SMITH");
        strs.add("BOB");

        it = strs.iterator();

        while(it.hasNext()){

            System.out.println(it.next());//BOB JACK JSON MARY SMITH
                                          //按第一位不相同的字母排列
        }

        //Date类型同理
    }
}

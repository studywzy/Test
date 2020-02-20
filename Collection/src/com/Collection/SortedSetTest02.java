package com.Collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Wzy
 * @date 2020-02-20 - 11:41
 *
 * 为什么SortedSet集合存储的元素可以自动排序？
 * 放入SortedSet的元素必须实现Comparable接口
 * SUN编写TreeSet集合在添加元素的时候，会调用compareTo方法完成比较
 */
public class SortedSetTest02 {

    public static void main(String[] args) {

        SortedSet users = new TreeSet();

        User u1 = new User(10);
        User u2 = new User(16);
        User u3 = new User(9);
        User u4 = new User(13);
        User u5 = new User(17);
        User u6 = new User(17);

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);

        Iterator it = users.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}

class User implements Comparable{

    int age;

    User(int age){

        this.age = age;
    }

    public String toString(){

        return "User[" + age + "]";
    }
    //实现java.long.Comparable;接口中的compareTo方法
    //该方法程序员负责实现，SUN提供的程序已经调用了该方法
    //需求：按照User的age排序
    public int compareTo(Object o){
        //编写一个比较规则
        int age1 = this.age;

        int age2 = ((User)o).age;

        return age1 - age2;

    }
}

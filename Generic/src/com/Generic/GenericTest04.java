package com.Generic;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Wzy
 * @date 2020-02-20 - 20:39
 *
 * SortedSet集合使用泛型
 */
public class GenericTest04 {

    public static void main(String[] args) {

        SortedSet<Manager> ss = new TreeSet<>();

        //添加
        Manager m1 = new Manager(1000.0);
        Manager m2 = new Manager(1500.0);
        Manager m3 = new Manager(1300.0);

        ss.add(m1);
        ss.add(m2);
        ss.add(m3);

        //遍历
        Iterator<Manager> it = ss.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }
    }
}

class Manager implements Comparable<Manager>{

    double sal;

    Manager(double sal){

        this.sal = sal;
    }

    public String toString(){

        return sal + "";
    }

    public int compareTo(Manager m){

        double sal1 = this.sal;
        double sal2 = m.sal;//不需要强转

        if(sal1 > sal2){
            return 1;
        }else if(sal1 < sal2){
            return -1;
        }
        return 0;
    }
}
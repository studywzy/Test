package com.Collection;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Wzy
 * @date 2020-02-19 - 18:17
 *
 * 关于往Set集合中存储的元素，该元素的hashCode和equals方法
 *
 * HashMap中有一个put方法，put(key,value)  key是无序不可重复的
 *
 * 结论：存储在HashSet集合或者HashMap的key部分的元素，需要同时重写hashCode方法和equals方法
 */
public class SetTest02 {

    public static void main(String[] args) {

        //创建集合
        Set es = new HashSet();

        Employee e1 = new Employee("1000","zhangsan");
        Employee e2 = new Employee("1001","zhangsan");
        Employee e3 = new Employee("2000","wangwu");
        Employee e4 = new Employee("2001","zhaosi");
        Employee e5 = new Employee("3000","lidan");
        Employee e6 = new Employee("3001","yangliu");
        Employee e7 = new Employee("1000","zhangsan");

        //添加元素
        es.add(e1);
        es.add(e2);
        es.add(e3);
        es.add(e4);
        es.add(e5);
        es.add(e6);
        es.add(e7);

        //查看集合元素个数
        System.out.println(es.size());
    }
}


//根据现实的业务逻辑得知：该公司员工编号是：1000-9999
class Employee{

    String no;

    String name;

    public Employee(String no,String name) {

        this.no = no;
        this.name = name;
    }

    //重写equals方法
    public boolean equals(Object o){

        if(this == o){

            return true;
        }
        if(o instanceof Employee){

            Employee e = (Employee)o;

            if(e.no.equals(this.no) && e.name.equals(this.name)){

                return true;
            }
        }

        return false;
    }

    //重写hashCode方法
    public int hashCode(){

        return no.hashCode();
    }

}
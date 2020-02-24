package com.Reflect;

import java.lang.reflect.Constructor;

/**
 * @author Wzy
 * @date 2020-02-24 - 23:52
 *
 * 获取某个特定的构造方法，然后创建对象
 */
public class ReflectTest09 {

    public static void main(String[] args) throws Exception{

        //获取类
        Class c = Class.forName("com.Reflect.Customer");

        //获取特定的构造方法
        Constructor con = c.getDeclaredConstructor(String.class,int.class);

        //创建对象
        Object o = con.newInstance("zhangsan",25);

        System.out.println(o);
    }
}

class Customer{

    String name;

    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){

        return "Customer[" + name + "," + age + "]";
    }
}

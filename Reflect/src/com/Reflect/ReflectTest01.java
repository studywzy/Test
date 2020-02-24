package com.Reflect;

import java.util.Date;

/**
 * @author Wzy
 * @date 2020-02-24 - 10:57
 *
 * 获取Class类型对象的三种方式
 */
public class ReflectTest01 {

    public static void main(String[] args) {

        //第一种方式
        Class c1 = null;
        try {
            //c1引用保存内存地址指向堆中的对象，该对象代表的是Employee整个类
            c1 = Class.forName("com.Reflect.Employee");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二种方式
        //java中每个 类型 都有class属性
        Class c2 = Employee.class;

        //第三种方式
        //java中任何一个java对象都有getlass方法
        Employee e = new Employee();
        Class c3 = e.getClass(); //c3是运行时类(e的运行时类是Employee)

        System.out.println(c1 == c2);//true
        System.out.println(c2 == c3);//true

        //c4,c5,c6都代表Date这个类
        Class c4 = Date.class;
        try {
            Class c5 = Class.forName("java.util.Date");//必须写类全名，类全名带有包名

        }catch (ClassNotFoundException e1){
            e1.printStackTrace();
        }

        Date d = new Date();
        Class c5 = d.getClass();

        //c6代表 int 类型
        Class c6 = int.class;

    }
}

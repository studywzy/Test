package com.Reflect;

import java.lang.reflect.Field;

/**
 * @author Wzy
 * @date 2020-02-24 - 21:09
 *
 * java.lang.reflect.Field获取某个特定的属性
 */
public class ReflectTest05 {

    public static void main(String[] args) throws Exception{

        //以前的方式：
        /*
        User u = new User();
        u.age = 12; //set
        System.out.println(u.age); //get
         */
        //获取类对象
        Class c = Class.forName("com.Reflect.User");

        //获取某个特定的属性
        Field idF = c.getDeclaredField("id");

        //获取到某个特定的属性可以用来？set  get
        Object o = c.newInstance();

        //private无法访问，解决办法：打破封装
        idF.setAccessible(true); //使用反射机制可以打破封装性，导致了java对象的属性不安全

        //给o对象的if属性赋值"110"
        idF.set(o,"110"); //set


        //get
        System.out.println(idF.get(o));




    }
}

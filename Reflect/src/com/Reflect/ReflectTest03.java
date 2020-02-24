package com.Reflect;

/**
 * @author Wzy
 * @date 2020-02-24 - 12:08
 *
 * 获取Class类型的对象之后，可以创建该"类"的对象
 */
public class ReflectTest03 {

    public static void main(String[] args) throws Exception{

        Class c = Class.forName("com.Reflect.Employee");

        //创建此Class对象所表示的一个新实例
        Object o = c.newInstance(); //调用了Employee的无参构造方法

        System.out.println(o);
    }
}

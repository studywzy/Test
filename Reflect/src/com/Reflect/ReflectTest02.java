package com.Reflect;

/**
 * @author Wzy
 * @date 2020-02-24 - 12:03
 */
public class ReflectTest02 {

    public static void main(String[] args) throws Exception{

        //将A.class文件装载到JVM中的过程,会执行静态语句块
        //Class.forName("com.Reflect.A");

        //不会执行静态语句块
        Class c = A.class;
    }
}

class A{

    static {
        System.out.println("A....");
    }
}

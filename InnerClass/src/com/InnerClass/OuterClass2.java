package com.InnerClass;

/**
 * @author Wzy
 * @date 2020-02-13 - 13:51
 */

/**
 * 局部内部类等同于局部变量，定义在方法体当中
 */
public class OuterClass2 {

    public void m1(){

        //局部变量
        int i = 10;

        //局部内部类不能用访问控制权限修饰符修饰
        class InnerClass{

            //局部内部类不能有静态声明
            //public static void m1(){}
            //static int i = 10;
            public void m2(){

                System.out.println(i);
            }
        }
        //调用m2
        InnerClass inner = new InnerClass();

        inner.m2();
    }

    public static void main(String[] args) {

        OuterClass2 o1 = new OuterClass2();

        o1.m1();


    }
}

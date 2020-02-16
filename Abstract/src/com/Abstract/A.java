package com.Abstract;

/**
 * @author Wzy
 * @date 2020-02-11 - 12:27
 * 1.抽象类有构造方法，但不可构造对象（实例化），给子类构造对象用
 * 2.构造方法不一定创造对象（super();）
 * 3.抽象类中可以定义抽象方法，抽象方法不可以有方法体，抽象类的非抽象子类应该把抽象方法覆盖重写
 * 4.抽象类中可以有变量，接口中只能有常量
 */
public abstract class A {
    public A(){

        System.out.println("A的构造方法运行");

    }
    int i;

    public static void main(String[] args) {

        A a = new B();

    }
}

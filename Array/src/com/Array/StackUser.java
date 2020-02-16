package com.Array;

/**
 * @author Wzy
 * @date 2020-02-16 - 11:15
 * 栈用户
 */
public class StackUser {

    String name;

    int age;

    public StackUser(String name,int  age) {

        this.name = name;

        this.age = age;
    }

    //重写toSting方法
    public String toString(){

        return "User name=" + name +",age=" + age;
    }
}

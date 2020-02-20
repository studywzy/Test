package com.Generic;

/**
 * @author Wzy
 * @date 2020-02-20 - 21:01
 *
 * 自定义泛型
 */
public class GenericTest05 {

    public static void main(String[] args) {

        Test<String> t = new Test<>();

        t.print("奥利给");
    }
}

class Test<T>{

    public  void print(T t){

        System.out.println("-->" + t);
    }
}
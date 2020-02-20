package com.Generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Wzy
 * @date 2020-02-20 - 17:50
 *
 * 关于JDK5.0新特性：泛型（编译期概念）
 *
 * 1.为什么引入泛型
 *      1.可以统一集合中的数据类型
 *      2.可以减少强制类型转换
 *
 * 2.泛型语法如何实现
 *      Test02
 *
 * 3.泛型的优点和缺点
 *     优点：统一类型，减少强制转换
 *     缺点：类型太统一了
 *
 * 以下程序没有使用泛型，缺点：
 *    如果集合不使用泛型，则集合中的元素类型不统一
 *    在遍历集合的时候，只能拿出来Object类型，，需要做
 *    大量的强制类型转换，比较麻烦
 */
public class GenericTest01 {

    public static void main(String[] args) {

        //创建一个集合存储A，B，C
        Set s = new HashSet();

        //创建对象
        A a = new A();
        B b = new B();
        C c = new C();

        s.add(a);
        s.add(b);
        s.add(c);

        //需求：遍历集合，如果是A类型调用m1方法，B类型调用m2方法，C类型调用m3方法
        Iterator it = s.iterator();
        while(it.hasNext()){
            Object o = it.next();

            //要完成需求只能做大量的强制类型转换
            if(o instanceof A){
                A a1 = (A)o;
                a1.m1();
            }else if(o instanceof B){
                B b1 = (B)o;
                b1.m2();
            }else if(o instanceof C){
                C c1 = (C)o;
                c1.m3();
            }
        }

    }
}

class A{
    public void m1(){
        System.out.println("A's m1方法执行");
    }
}

class B{
    public void m2(){
        System.out.println("B's m2方法执行");
    }
}

class C{
    public void m3(){
        System.out.println("C's m3方法执行");
    }
}
package com.Integer;

/**
 * @author Wzy
 * @date 2020-02-18 - 14:50
 * 深入自动装箱和自动拆箱：
 *    1.自动装箱和自动拆箱是程序编译阶段的一个概念，和程序运行无关
 *    2.自动装箱和自动拆箱主要目的是方便程序员编码
 */
public class IntegerTest02 {

    public static void main(String[] args) {

        Integer i1 = new Integer(10);

        Integer i2 = new Integer(10);

        //这里不会有自动拆箱
        System.out.println(i1 == i2);//false

        //比较两个Integer类型是否相等不能用==
        //Integer已经重写了Object的equals方法
        System.out.println(i1.equals(i2));

        Integer i3 = 128;

        Integer i4 = 128;

        //上面等同于
        //Integer i3 = new Integer(128);
        //Integer i4 = new Integer(128);

        System.out.println(i3 == i4);//false

        //注意以下程序
        //如果数据是在（-128~127）之间，java引入了一个"整型常量池"
        Integer i5 = 127;

        Integer i6 = 127;

        System.out.println(i5 == i6);//true

        Integer i7 = -128;

        Integer i8 = -128;

        System.out.println(i7 == i8);//true

        Integer i9 = -129;

        Integer i10 = -129;

        System.out.println(i9 == i10);//false

    }

}

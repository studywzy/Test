package com.Array;

/**
 * @author Wzy
 * @date 2020-02-15 - 17:44
 * 动态初始化一维数组
 * 1.动态初始化一维数组，会先在堆内存中分配这个数组，并且每个元素都采用默认值
 */
public class ArrayTest02 {

    public static void main(String[] args) {

        //登台声明一个一维数组，最多可以储存四个元素
        int[] a1 = new int[4];

        for (int i = 0;i < a1.length;i++ ){

            System.out.println(a1[i]);
        }

        a1[0] = 10;

        for (int i = 0;i < a1.length;i++ ) {

            System.out.println(a1[i]);
        }
    }
}

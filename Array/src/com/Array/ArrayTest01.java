package com.Array;

/**
 * @author Wzy
 * @date 2020-02-15 - 17:34
 * 静态初始化一维数组
 */
public class ArrayTest01 {

    public static void main(String[] args) {

        int[] a1 = {10,20,30};

        System.out.println(a1[1]);

        System.out.println(a1[2]);

        System.out.println(a1[a1.length - 1]);

        //遍历
        for (int i = 0;i <= a1.length - 1;i ++){

            System.out.println(a1[i]);
        }

        //修改某位元素
        a1[2] = 40;

        System.out.println(a1[2]);
    }
}

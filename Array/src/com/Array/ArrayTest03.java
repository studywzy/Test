package com.Array;

import com.sun.istack.internal.NotNull;

/**
 * @author Wzy
 * @date 2020-02-15 - 21:09
 * 1.二维数组是一个特殊的一维数组
 * 2.特殊在每个元素都是一个一维数组
 */
public class ArrayTest03 {

    public static void main(String[] args) {

        //静态初始化二维数组
        int[][] a = {
                        {1,2,3},
                        {45,34},
                        {0},
                        {10,23,85,99}
        };

        //获取第一个一维数组
        int[] a0 = a[0];

        System.out.println(a0);
        //获取第一个一维数组的第一个元素
        int a00 = a[0][0];

        System.out.println(a00);
        //获取二维数组的最后一个元素
        System.out.println(a[a.length-1][a[a.length-1].length-1]);
        //遍历二维数组
        ArrayTest03.bianli(a);

        //动态初始化二维数组
        //三个一维数组，每个一位数据四个数据
        int[][] b= new int[3][4];

        ArrayTest03.bianli(b);

        b[1][2] = 20;

        ArrayTest03.bianli(b);

    }

    public static void bianli(@NotNull int[][] a){

        System.out.println("--------------");

        for(int i = 0;i < a.length;i ++){

            for(int j = 0;j < a[i].length;j ++){

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

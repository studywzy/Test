package com.Exception;

/**
 * @author Wzy
 * @date 2020-02-14 - 18:35
 * finally语句块
 * finally语句块一定会执行，除非提前关闭JVM，System.exit(0);
 * 可以try...finally...
 * 也可以try...catch...finally...
 */
public class ExceptionTest04 {

    public static void main(String[] args) {

        int i = m1();

        System.out.println(i);//10
    }

    public static int m1(){

        int i = 10;

        try{
            return i;

        }finally{

            i++;

            System.out.println("m1的i=" + i);//11
        }
        /*
        实际相当于
        int i = 10;

        try{
            int temp = i;

            return temp;

        }finally{
            i++;

            System.out.println("m1的i=" + i);
        }
         */
    }
}

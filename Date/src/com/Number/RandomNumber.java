package com.Number;

import java.util.Random;

/**
 * @author Wzy
 * @date 2020-02-18 - 20:38
 * 生成随机数
 */
public class RandomNumber {

    public static void main(String[] args) {

        //创建一个新的随机数生成器
        Random r = new Random();

        //生成int类型的随机数

        int i =r.nextInt(101);//[0~100]之间的随机数

        System.out.println(i);

        //循环生成5个随机数
        for(int j = 0;j < 5;j ++){

            System.out.println(r.nextInt(101));

        }
    }
}

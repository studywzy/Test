package com.Number;

import java.util.Random;

/**
 * @author Wzy
 * @date 2020-02-18 - 21:11
 *
 * 生成5个不重复的随机数[1-5]
 */
public class RandomNumberDif {

    public static void main(String[] args) {

        Random r = new Random();

        int[] a = new int[5];

        int index = 0;

        while (true){

            int temp = r.nextInt(6);

            if(temp != 0 && !contains(a,temp)){

                a[index] = temp;

                index ++;

                if(index == 5){

                    break;
                }
            }
        }

        for(int i = 0;i < a.length;i ++){

            System.out.println(a[i]);

        }

    }

    //该方法完成判断temp在a数组中是否包含
    //包含返回true
    public static boolean contains(int[] a,int temp){

        for(int i = 0;i < a.length;i ++){

            if(temp == a[i]){

                return true;
            }
        }

        return false;
    }
}

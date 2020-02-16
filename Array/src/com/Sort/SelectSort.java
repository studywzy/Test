package com.Sort;

/**
 * @author Wzy
 * @date 2020-02-16 - 16:45
 * 选择排序
 * 算法：找出最小值，然后将它和最前面的数据交换位置
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] a = {3,1,6,2,5};

        //选择排序
        for(int i = 0;i < a.length - 1;i ++){

            //假设第一个元素是最小值
            //记录最小值的下标，方便随后交换
            int min = i;

            for(int j = i + 1;j < a.length;j ++){

                if(a[min] > a[j]){

                    //给min重新赋值，此时a[min]为最小值
                    min = j;
                }
            }
            //交换
            if(min != i){

                int temp;

                temp = a[min];

                a[min] = a[i];

                a[i] = temp;
            }
        }

        for(int i = 0;i < a.length;i ++){
            System.out.print(a[i] + " ");
        }

    }
}

/*

3 1 6 2 5

第一次循环：
1 3 6 2 5

3 6 2 5
第二次循环：
2 6 3 5

6 3 5
第三次循环：
3 6 5

6 5
第四次循环
5 6
 */

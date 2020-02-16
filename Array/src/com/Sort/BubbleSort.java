package com.Sort;

/**
 * @author Wzy
 * @date 2020-02-16 - 16:28
 * 冒泡排序，冒泡
 * 先找最大的
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {3,1,6,2,5};

        //开始排序
        for(int i = a.length - 1;i > 0;i --){

            for(int j = 0;j < i;j ++){

                if(a[j] > a[j+1]){

                    int temp;

                    temp = a[j];

                    a[j] = a[j + 1];

                    a[j + 1] = temp;
                }
            }
        }

        for(int i = 0;i < a.length;i ++){

            System.out.print(a[i] + " ");
        }

    }
}

/*

3 1 6 2 5

第一次循环:
1 3 6 2 5
1 3 6 2 5
1 3 2 6 5
1 3 2 5 6

1 3 2 5
第二次循环:
1 3 2 5
1 2 3 5
1 2 3 5

1 2 3
第三次循环:
1 2 3
1 2 3

1 2
第四次循环
1 2
 */

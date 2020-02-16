package com.Sort;

/**
 * @author Wzy
 * @date 2020-02-16 - 17:23
 * 二分法查找
 * 1.二分法查找是建立在已经排过序的基础上的
 * 2.以下程序分析从小到大排序
 * 3.这个数组中没有重复的元素
 *
 * 1 3 5 9 11 13 15
 * 以上是一个已经排好序的int类型数组，要求快速找出13的下标
 * 算法思路：
 * 1 3 5 9 11 13 15
 *
 * int begin = 0;
 * int end = 6;
 * int mid = 3;
 * 中间元素是9,9<13
 * begin = mid + 1;  4
 * end = 6;
 * mid = 5;
 * 中间元素是13    13 == 13，结束
 * 如果所找元素比中间元素小，则：
 * end = mid - 1;
 * mid = (begin + end) / 2,以此类推
 */
public class HalfFind {

    public static void main(String[] args) {

        int[] a = {1,3,4,5,7,8,9,10,23,25,29};

        //要求从a数组中查找10这个元素的下标

        int destElement = 10;

        int index = binarySearch(a,destElement);

        System.out.println((index == -1) ? destElement + "该元素不存在" : destElement + "在数组中的下标是: " + index);

    }

    //折半查找的核心算法
    public static int binarySearch(int[] a,int destElement) {

        int begin = 0;

        int end = a.length - 1;


        while (begin <= end) {

            int mid = (begin + end) / 2;

            if (a[mid] == destElement) {

                return mid;

            } else if (a[mid] > destElement) {

                end = mid - 1;

            } else if (a[mid] < destElement) {

                begin = mid + 1;
            }
        }

        return -1;
    }
}



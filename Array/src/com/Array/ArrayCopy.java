package com.Array;

/**
 * @author Wzy
 * @date 2020-02-15 - 18:32
 * 自己实现数组拷贝方法
 */
public class ArrayCopy {

    public static void main(String[] args) {

        int[] src = {12,20,34,21,26};

        int[] dest = {26,85,34,23,27,56,58};

        /*
        System.arraycopy(src,1,dest,0,4);
        */

        ArrayCopy.arraycopy1(src,1,dest,1,3);

        for(int i = 0;i < dest.length;i ++){

            System.out.println(dest[i]);
        }
    }

    public static void arraycopy1(int[] src, int srcPos, int[] dest, int destPos, int length){

        for(int i = 0;i < length;i ++){

            dest[destPos + i] = src[srcPos + i];
        }
    }
}

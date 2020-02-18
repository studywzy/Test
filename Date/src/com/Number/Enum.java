package com.Number;

/**
 * @author Wzy
 * @date 2020-02-18 - 20:45
 * 枚举类型
 *
 * 程序执行成功但是存在风险，对于divide方法的返回值程序员可能粗心写错
 * 所以可以"引入枚举类型"
 */
public class Enum {

    public static void main(String[] args) {

        int a = 10;

        int b = 0;

        Result retValue = divide(a,b);

        if(retValue == Result.SUCCESS) {

            System.out.println("成功");

        }else if(retValue == Result.FALL){

            System.out.println("失败");
        }

    }

    //需求：定义一个方法，计算两个int类型数据的商，如计算成功返回1，否则返回0
    public static Result divide(int a,int b){

        try{

            int c  = a / b;

            // 原代码
            // return 1;

            //改为枚举之后的代码
            return Result.SUCCESS;

        }catch(Exception e){

            //原代码
            //return 0;

            return Result.FALL;
        }

    }

}

//新加的
//定义一个枚举类型
enum Result{

    //成功和失败
    //规范要求：大写
    SUCCESS,FALL
}

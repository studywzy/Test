package com.Foreach;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Wzy
 * @date 2020-02-20 - 21:07
 *
 * JDK5.0新特性：
 *      关于增强for循环
 *      语法：
 *          for(类型 变量:数组名/集合名){}
 *      集合想使用增强for循环这种语法，集合需要使用泛型
 *      如果不使用泛型，需要用Object类型来定义元素
 */
public class ForeachTest01 {

    public static void main(String[] args) {

        int[] a = {1,2,34,5,6,7};

        //遍历
        for(int i = 0;i <a.length;i ++){
            System.out.println(a[i]);
        }

        System.out.println("=========");
        //foreach
        for(int e:a){
            System.out.println(e);
        }

        System.out.println("=========");

        //集合
        Set<String> strs = new HashSet<>();

        strs.add("张三");
        strs.add("李四");
        strs.add("王五");
        strs.add("赵六");

        for(String e:strs){
            System.out.println(e);
        }
    }
}

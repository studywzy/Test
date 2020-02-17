package com.Integer;

/**
 * @author Wzy
 * @date 2020-02-17 - 17:30
 *
 * 封箱讲解
 * int的封装类型
 */
public class IntegerTest01 {

    public static void main(String[] args) {

        //可自动封箱拆箱
        //int -> Integer
        Integer i1 = 10;

        //Integer -> int
        int i2 = i1;

        System.out.println(i2 + 1);

        //重要:static int parseInt(String s);
        //Integer类的方法
        //String -> int
        //注意:此处String应为数字字符串否则报NumberFormatException
        int age = Integer.parseInt("25");

        System.out.println(age + 1);

        //重要：static double parseDouble(String s)
        //Double类的方法
        //String -> double
        double pi = Double.parseDouble("3.14");

        System.out.println(pi + 3.1);

        //将int类型的十进制转换成二进制
        String s1 = Integer.toBinaryString(10);

        System.out.println(s1);

        //将int类型的十进制转换成十六进制
        String s2 = Integer.toHexString(10);

        System.out.println(s2);

        //将int类型的十进制转换成八进制
        String s3 = Integer.toOctalString(10);

        System.out.println(s3);

        //将int类型转为Integer类型
        Integer i3 = Integer.valueOf(10);

        System.out.println(i3);

        //将String类型转为Integer类型
        Integer i4 = Integer.valueOf("10");

        System.out.println(i4);

    }
}

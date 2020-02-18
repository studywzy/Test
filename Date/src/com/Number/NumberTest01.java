package com.Number;

import java.text.DecimalFormat;

/**
 * @author Wzy
 * @date 2020-02-18 - 20:21
 * java.text.DecimalFormat;
 * 数字格式元素
 *      # 任意数字
 *      , 千分位
 *      . 小数点
 *      0 不够补0
 */
public class NumberTest01 {

    public static void main(String[] args) {

        //1.创建数字格式化对象
        //需求：加入千分位
        DecimalFormat df = new DecimalFormat("###,###");

        //开始格式化
        //Number -> String_
        System.out.println(df.format(1234567));//1,234,567

        //需求：加入千分位，保留2位小数
        DecimalFormat df1 = new DecimalFormat("###,###.##");

        System.out.println(df1.format(1234567.123));//1,234,567.12

        //需求：加入千分位，保留四位小数，不够补0

        DecimalFormat df2 = new DecimalFormat("###,###.0000");

        System.out.println(df2.format(1234567.123));//1,234,567.1230
    }
}

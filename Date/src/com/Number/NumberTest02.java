package com.Number;

import java.math.BigDecimal;

/**
 * @author Wzy
 * @date 2020-02-18 - 20:35
 * java.math.BigDecimal
 * 该类型的数据精确度极高，适合做财务软件
 * 财务软件中double类型精度太低
 */
public class NumberTest02 {

    public static void main(String[] args) {

        //创建大数据
        BigDecimal v1 = new BigDecimal(10);

        BigDecimal v2 = new BigDecimal(20);

        BigDecimal v3 = v1.add(v2);

        System.out.println(v3);
    }
}

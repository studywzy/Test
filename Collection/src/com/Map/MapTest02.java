package com.Map;

import java.util.Properties;

/**
 * @author Wzy
 * @date 2020-02-20 - 14:53
 *
 * HashMap默认初始化容量是16，默认加载因子0.75
 * Hashtable默认初始化容量是11，默认加载因子0.75
 * java.util.Properties; 也是由key和value组成，但是key和value都是字符串类型
 */
public class MapTest02 {

    public static void main(String[] args) {

        Properties p = new Properties();

        //key不能重复，重复则覆盖value
        p.setProperty("1","fail");
        p.setProperty("2","success");
        p.setProperty("3","fighting");

        String s1 = p.getProperty("1");
        String s2 = p.getProperty("2");
        String s3 = p.getProperty("3");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

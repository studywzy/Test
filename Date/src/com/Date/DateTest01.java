package com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wzy
 * @date 2020-02-18 - 15:31
 * 日期格式元素：
 * y 年
 * M 月
 * d 日
 * H 小时
 * m 分
 * s 秒
 * S 毫秒
 */
public class DateTest01 {

    public static void main(String[] args) {

        /**
         * 获取自1970年1月1日 00时00分00秒000毫秒到当前的毫秒数
         */
        long now = System.currentTimeMillis();

        System.out.println(now);

        /**
         * 获取系统当前时间
         */
        Date nowtime = new Date();

        System.out.println(nowtime);//Tue Feb 18 15:34:16 CST 2020

        //Date已经重写了toString方法，但是对于中国人不太容易理解，可以格式化将之转化成字符串

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");

        String strtime = sdf.format(nowtime);//日期转成字符串

        System.out.println(strtime);

        /**
         * 获取特定的日期
         */
        String strtime1 = "2008年08月08日 08:08:08 888";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");

        Date t;
        try{

            t = sdf1.parse(strtime1);//字符串转成日期

            System.out.println(t);//Fri Aug 08 08:08:08 CST 2008

        }catch(java.text.ParseException e){

            e.printStackTrace();
        }




    }
}

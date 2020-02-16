package com.User;


import java.util.Date;

/**
 * @author Wzy
 * @date 2020-02-03 - 13:14
 * 封装练习
 */

public class UserTest {

    public static void main(String[] args){

        Date t = new Date();

        User user = new User();

        user.setAge(160);

        System.out.println("年龄是" + user.getAge());

        user.setAge(100);

        System.out.println("年龄是" + user.getAge());
    }
}

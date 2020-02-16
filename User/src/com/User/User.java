package com.User;

/**
 * @author Wzy
 * @date 2020-02-03 - 13:13
 * 封装练习
 */

public class User {

    private int age;

    public User() {
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        if(age < 0 || age>100){

            System.out.println("您输入的年龄不合法");

            return;
        }

        this.age = age;
    }
}

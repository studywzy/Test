package com.Exception;

/**
 * @author Wzy
 * @date 2020-02-14 - 21:12
 */

//顾客相关的业务
public class CustomerService {

    public void register(String name) throws IllegalNameException{

        //完成注册

        if(name.length() < 6){

            //手动抛出异常
            throw new IllegalNameException("用户名长度不能少于6位");
        }

        //如果代码能执行到此处，说明用户名合法
        System.out.println("注册成功");
    }
}

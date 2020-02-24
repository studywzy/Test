package com.Reflect;

/**
 * @author Wzy
 * @date 2020-02-24 - 21:32
 */
public class CustomerService {

    //登录
    public boolean login(String name,String pwd){

        if("admin".equals(name) && "123".equals(pwd)){

            return true;
        }
        return false;
    }

    //退出
    public void logout(){

        System.out.println("系统安全退出");
    }
}

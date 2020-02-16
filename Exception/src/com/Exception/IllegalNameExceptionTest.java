package com.Exception;


import java.util.Scanner;

/**
 * @author Wzy
 * @date 2020-02-14 - 21:12
 * 模拟注册
 * dasd
 */
public class IllegalNameExceptionTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("请输入用户名:");

        String name = s.next();

        CustomerService cs = new CustomerService();

        try{

            cs.register(name);

        }catch (IllegalNameException e){

            System.out.println(e.getMessage());

        }
    }
}

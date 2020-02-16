package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-13 - 23:01
 * 处理异常的第二种方式：捕捉try...catch...
 * 语法：
 *      try{
 *          可能出现异常的代码；
 *      }catch（异常类型1 变量）{
 *          处理异常的代码；
 *      }catch（异常类型2 变量）{
 *          处理异常的代码；
 *      }...
 *
 * 1.catch语句块可以写多个
 * 2.但是从上到下catch，必须从小类型异常到大类型异常捕捉
 * 3.try...catch...中最多执行1个catch语句块，执行之后try...catch...就结束了
 */
public class ExceptionTest03 {

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("sadas");

            fis.read();

        }catch (FileNotFoundException e){

        }catch (IOException io){

        }
    }

    /*
    编译无法通过，因为IO异常包括FileNotFound异常
    catch语句块可以写多个但是要自上而下，从小到大
    try {
            FileInputStream fis = new FileInputStream("sadas");

            fis.read();
        }catch (IOException io){

        }catch (FileNotFoundException e){

        }
     */
}

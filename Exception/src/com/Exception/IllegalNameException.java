package com.Exception;

/**
 * @author Wzy
 * @date 2020-02-14 - 21:12
 * 自定义"无效名字异常"
 * 1.编译时异常，直接继承Exception
 * 2.运行时异常，直接继承RuntimeException
 */
public class IllegalNameException extends Exception{

    public IllegalNameException(){

    };

    public IllegalNameException(String msg){

        super(msg);
    }
}

package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 1
 * @author Wzy
 * @date 2020-02-13 - 20:40
 * 处理异常的第一种方法： 声明抛出 throws关键字
 * 在方法声明的位置上使用throws关键字向上抛出异常
 */
public class ExceptionTest01 {

    public static void main(String[] args) throws FileNotFoundException {
        //也可以throws IOException或者Exception,他们都是FileNotFoundException的超类

        //未报告的异常，编译异常，防止文件不存在或路径给错，需要捕捉或者声明抛出
        FileInputStream fis = new FileInputStream("asdja");
    }
}


package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Wzy
 * @date 2020-02-13 - 20:57
 * 深入throws
 * 使用throws处理异常不是真正处理异常而是推卸责任，层层上抛
 * 谁调用的就是抛给谁
 */
public class ExceptionTest02 {

    public static void main(String[] args) throws FileNotFoundException{

        m1();
    }

    public static void m1() throws FileNotFoundException{

        m2();
    }

    public static void m2() throws FileNotFoundException{

        m3();
    }

    public static void m3() throws FileNotFoundException {

        new FileInputStream("dsadas");
    }
}

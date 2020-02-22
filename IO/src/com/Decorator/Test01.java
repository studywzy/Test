package com.Decorator;

/**
 * @author Wzy
 * @date 2020-02-22 - 10:08
 */
public class Test01 {

    public static void main(String[] args) {

        //1.创建被装饰者
        FileReader fr = new FileReader();
        //2.创建装饰者
        BufferedReader br = new BufferedReader(fr);
        //3.通过装饰者的方法间接执行被装饰者中的方法
        br.close();
    }
}

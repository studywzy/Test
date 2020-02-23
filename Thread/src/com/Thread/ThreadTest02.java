package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-22 - 22:07
 *
 * java中实现线程的第二种方式：
 *    第一步：写一个类实现java.long.Runnable;接口
 *    第二部：实现run方法
 */
public class ThreadTest02 {

    public static void main(String[] args) {

        //创建线程
        Thread t = new Thread(new Processor2());

        //启动线程
        t.start();
    }
}

//这种方式是推荐的，因为一个类实现接口之外保留了类的继承
class Processor2 implements Runnable{

    public void run(){

        for(int i = 0;i < 10;i ++){
            System.out.println("run -->" + i);
        }

    }
}

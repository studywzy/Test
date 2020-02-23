package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 10:03
 *
 * java采用抢占式线程调度模型
 * 优先级高的获得的cpu时间片多一点
 *
 * 优先级：1-10
 * 优先级最高为10，最低为1，默认为5
 */
public class ThreadTest04 {

    public static void main(String[] args) {

        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        Thread t1 = new Thread(new Processor4());
        t1.setName("t1");

        Thread t2 = new Thread(new Processor4());
        t2.setName("t2");

        System.out.println(t1.getPriority()); //5
        System.out.println(t2.getPriority()); //5

        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);

        //启动线程
        t1.start();
        t2.start();
    }
}

class Processor4 implements Runnable{

    public void run(){

        for(int i = 0;i < 50;i ++){

            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }

    }
}

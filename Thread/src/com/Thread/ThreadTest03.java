package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-22 - 23:15
 *
 * 关于线程的三个方法
 * 1.获取当前线程对象  Thread.currentThread();
 * 2.给线程起名字 t.setName(String name)
 * 3.获取线程的名字 t.getName()
 */
public class ThreadTest03 {

    public static void main(String[] args) {

        //如何获取当前线程对象
        Thread t = Thread.currentThread(); //t保存的内存地址指向的是"主线程对象"

        //获取线程的名字
        System.out.println(t.getName()); //main

        Thread t1 = new Thread(new Processor3());

        //给线程起名
        t1.setName("t1");

        t1.start();

        Thread t2 = new Thread(new Processor3());

        t2.setName("t2");

        t2.start();

    }
}

class Processor3 implements Runnable{

    public void run(){

        Thread t = Thread.currentThread();
        System.out.println(t.getName()); //Thread-0 Thread-1
    }
}

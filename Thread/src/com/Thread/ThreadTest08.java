package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 12:00
 *
 * Thread.yield();
 *
 * 1.该方法是一个静态方法
 * 2.作用：给同一个优先级的线程让位，但是让位时间不固定
 * 3.和sleep方法相同，就是yield时间不固定
 */
public class ThreadTest08 {

    public static void main(String[] args) {

        Thread t = new Thread(new Processor8());

        t.setName("t");

        t.start();

        for(int i = 0;i < 300;i ++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}

class Processor8 implements Runnable{

    public void run(){

        for(int i = 0;i < 500;i ++){

            System.out.println(Thread.currentThread().getName() + "-->" + i);

            if(i % 20 == 0){

                Thread.yield();

            }
        }
    }
}
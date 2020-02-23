package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 10:14
 *
 * 1.Thread.sleep(毫秒);
 * 2.sleep方法是一个静态方法
 * 3.该方法的作用是:阻塞当前线程,腾出CPU，让给其他线程
 */
public class ThreadTest05 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Processor5());
        t1.setName("t1");
        t1.start();

        for(int i = 0;i < 10;i ++){

            System.out.println(Thread.currentThread().getName() + "-->" + i);

            //阻塞主线程
            try {
                Thread.sleep(500);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Processor5 implements Runnable{

    //重写的方法不能比被重写的方法抛出更多的异常
    //Thread中的run方法没有抛出异常，所以只能用try...catch...
    public void run(){

        for (int i = 0;i < 10;i ++){

            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                Thread.sleep(1000);//让当前线程阻塞1秒
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
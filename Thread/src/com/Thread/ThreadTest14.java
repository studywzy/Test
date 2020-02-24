package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-24 - 10:14
 *
 * 守护线程
 * t.setDaemon(); 方法
 *
 *      其他所有的用户线程结束，则守护线程退出！
 *      守护线程一般都是无限执行的
 */
public class ThreadTest14 {

    public static void main(String[] args) {

        Thread t1 = new Processor14();

        t1.setName("t1");

        //将这个线程修改为守护线程

        t1.setDaemon(true);

        t1.start();

        for(int i = 0;i < 10;i ++){

            System.out.println(Thread.currentThread().getName() + "-->" + i);

            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Processor14 extends Thread{

    public void run(){

        int i = 0;

        while (true){

            i ++;

            System.out.println(Thread.currentThread().getName() + "-->" + i);

            try {

                Thread.sleep(500);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

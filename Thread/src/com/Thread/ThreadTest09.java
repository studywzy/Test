package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 12:06
 *
 * 线程的合并
 * t.join();  成员方法
 */
public class ThreadTest09 {

    public static void main(String[] args) {

        Thread t = new Thread(new Processor9());

        t.setName("t");

        t.start();

        //合并线程
        /*try {
            t.join();//t和主线程合并,变成单线程程序

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        */
        for(int i = 0;i < 10;i ++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}

class Processor9 implements Runnable{

    public void run(){

        for(int i = 0;i < 10;i ++){

            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + i);

        }
    }
}

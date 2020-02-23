package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 11:47
 *
 * 如何正确的更好的终止一个正在执行的线程
 * 需求：线程启动5s之后终止
 */
public class ThreadTest07 {

    public static void main(String[] args) {

        Processor7 p7 = new Processor7();

        Thread t = new Thread(p7);

        t.setName("t");
        t.start();

        //5s之后终止
        try {
            Thread.sleep(5000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //终止,加一个标识
        p7.run = false;
    }
}

class Processor7 implements Runnable{

    boolean run = true;

    public void run(){

        for(int i = 0;i < 10;i ++){

            if(run){
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }

        }
    }
}

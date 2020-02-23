package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 11:39
 *
 * 某线程正在休眠，如何打断它的休眠
 * 以下方式依靠异常处理机制
 */
public class ThreadTest06 {

    public static void main(String[] args) {

        //需求：启动线程，5s之后打断线程的休眠
        Thread t = new Thread(new Processor6());

        t.setName("t");

        t.start();

        //5s之后
        try {
            Thread.sleep(5000);


        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //打断t的休眠
        t.interrupt();

    }
}

class Processor6 implements Runnable{

    public void run(){
        try{
            Thread.sleep(1000000000000L);

            System.out.println("HelloWorld");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int i = 0;i < 10;i ++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}

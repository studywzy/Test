package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-22 - 21:53
 *
 * java中实现多线程的第一种方式
 *     第一步：继承java.lang.Thread;
 *     第二部：重写run方法
 *
 *   如何定义线程？
 *   如何创建线程？
 *   如何启动线程？
 */
public class ThreadTest01 {

    public static void main(String[] args) {

        //创建线程
        Thread t = new Processor1();

        //启动
        t.start();//这段代码执行瞬间结束，告诉JVM再分配一个新的栈给t线程
                  //run不需要程序员手动调用，系统线程启动之后自动调用run方法

        //t.run(); //这是普通的方法调用，还是单线程，只分配一个栈

        //这段代码再主线程中运行
        for(int i = 0;i < 10;i ++){
            System.out.println("main -->" + i);
        }
        /*
        有了多线程之后，main方法结束只是主线程栈中没有方法栈帧了
        但是其他线程或者其他栈中还有栈帧
        main方法结束，程序可能还在运行
         */

    }
}

//定义一个线程
class Processor1 extends Thread{

    //重写run方法
    public void run(){

        for(int i =0;i < 30;i ++){

            System.out.println("run -->" + i);
        }
    }
}

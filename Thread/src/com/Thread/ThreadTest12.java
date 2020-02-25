package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 23:22
 *
 * 类锁，类只有一个，所以锁是类级别的，只有一个
 */
public class ThreadTest12 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Processor11());
        Thread t2 = new Thread(new Processor11());

        t1.setName("t1");
        t2.setName("t2");

        t1.start();

        //保证m1方法会执行
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();

    }
}

class Processor11 implements Runnable{

    public void run(){

        if("t1".equals(Thread.currentThread().getName())){

            MyClass.m1();
        }
        if("t2".equals(Thread.currentThread().getName())){

            MyClass.m2();
        }
    }
}
class MyClass{

    //synchronized添加到静态方法上，线程执行此方法的时候会找类锁
    public synchronized static void m1(){

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("m1.....");
    }

    //不会等m1结束，因为该方法没有被synchronized修饰
    /*
    public static void m2(){

        System.out.println("m2.....");
    }
    */

    //m2等m1运行结束后才会执行，因为类锁只有一个并且被m1拿走了
    public synchronized static void m2(){

        System.out.println("m2.....");
    }
}

/*
第一次运行结果（修饰掉的部分）：m2.....
                          m1.....

第二次运行结果（没修饰的部分）：m1.....
                          m2.....
 */

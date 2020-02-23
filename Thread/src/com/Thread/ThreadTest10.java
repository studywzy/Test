package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 12:15
 *
 * t1和t2
 *
 * 异步编程模型：t1线程执行t1的，t2线程执行t2的，两个线程互不等待
 *
 * 同步编程模型：t1线程和t2线程执行。当t1线程必须等t2线程执行结束后，t1才能执行
 *
 * 什么时候要同步呢？为什么要引入线程同步？
 *    1.为了数据的安全，尽管应用程序的使用率降低，但是为了保证数据是安全的，必须加入线程同步机制
 *    线程同步机制使程序变成了（等同）单线程
 *
 *    2.什么条件下使用线程同步
 *         1.必须是多线程环境
 *         2.多线程环境共享同一个数据
 *         3.共享的数据涉及到修改操作
 *
 * 以下程序演示取款例子。以下程序不使用线程同步机制，多线程同时对同一个账户进行取款操作
 * 会出现什么问题
 */
public class ThreadTest10 {

    public static void main(String[] args) {

        //创建一个公共账户
        Account act = new Account("actno-001",5000.0);

        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Processor10(act));
        Thread t2 = new Thread(new Processor10(act));

        t1.start();
        t2.start();

    }
}

//取款线程
class Processor10 implements Runnable{

    //账户
    Account act;

    public Processor10(Account act){
        this.act = act;
    }
    public void run(){

        act.withdraw(1000.0);

        System.out.println("取款1000.0成功，余额： " + act.getBalance());
    }
}

//账户
class Account{

    private String actno;
    private double balance;
    public Account(){}

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //对外提供一个取款的方法
    public void withdraw(double money){

        double after = balance - money;

        try {
            Thread.sleep(1000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //更新
        this.setBalance(after);
    }
}

package com.Thread;

/**
 * @author Wzy
 * @date 2020-02-23 - 14:31
 *
 * 以下程序演示取款例子。使用线程同步机制，多线程同时对同一个账户进行取款操作
 */
public class ThreadTest11 {

    public static void main(String[] args) {

            //创建一个公共账户
            Account1 act = new Account1("actno-001",5000.0);

            //创建线程对同一个账户取款
            Thread t1 = new Thread(new com.Thread.Processor10(act));
            Thread t2 = new Thread(new com.Thread.Processor10(act));

            t1.start();
            t2.start();

    }
}


//账户
class Account1 extends Account{
    /*
    private String actno;

    private double balance;
    */
    public Account1(){}

    public Account1(String actno,double balance){

        super.setActno(actno);
        super.setBalance(balance);
    }


    //对外提供一个取款的方法
    public void withdraw(double money){

        /*
        把需要同步的代码，放到同步语句块中(synchronized关键字也可以加在成员方法前面，但是加在需要
        同步的代码更精确，建议不要加在成员方法前面)

            原理：t1线程和t2线程
            t1线程执行到此处，遇到了synchronized关键字，就会去找this的对象锁
            如果找到this对象锁，则进入同步语句块中执行程序。当同步语句块中的代码
            执行结束后，t1线程归还this的对象锁

            在t1线程执行同步语句块的过程中，如果t2线程也过来执行以下代码，也遇到
            synchronized关键字，所以也去找this的对象锁，但是该对象锁被t1线程持有，
            只能等待this对象锁的归还
         */
        synchronized (this){
            double after = this.getBalance() - money;

            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }

            //更新
            this.setBalance(after);
        }

    }

}

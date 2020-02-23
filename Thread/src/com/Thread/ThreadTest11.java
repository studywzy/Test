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

        //把需要同步的代码，放到同步语句块中
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

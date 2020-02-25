package com.AlternateOutput;

/**
 * @author Wzy
 * @date 2020-02-25 - 21:09
 *
 * 交替输出
 *
 * 两个线程对1个共享的数据操作
 * t.wait();
 * t.notify();
 */
public class Test {

    public static void main(String[] args) {

        Num num = new Num(1);

        Thread t1 = new Thread(new PrintOdd(num));

        Thread t2 = new Thread(new PrintEven(num));

        t1.setName("t1");

        t2.setName("t2");

        t1.start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t2.start();
    }

}

//共享shuju
class Num{

    int count;
    Num(int count){
        this.count = count;
    }

    //打印奇数的方法
    /*
           t1线程执行该方法，拿走num对象的对象锁
           并且输出t1-->1，唤醒t2线程，虽然被唤醒，
           t2线程并不会马上执行，因为t2线程无法获取到
           对象锁，当printOdd方法执行this.wait().
           t1线程无限期的等待，printOdd方法结束，释放对象锁
           然后t2线程获取到对象锁，开始执行printEven方法
     */
    public synchronized void printOdd(){

        System.out.println(Thread.currentThread().getName() + "-->" + (count ++));

        this.notifyAll();
        try {
            Thread.sleep(1000);
            this.wait();//t1无期限等待
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //打印偶数的方法
    public synchronized void printEven(){

        System.out.println(Thread.currentThread().getName() + "-->" + (count ++));

        this.notifyAll();
        try {
            Thread.sleep(1000);
            this.wait();//t2无期限等待
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

//线程1
class PrintOdd implements Runnable{

    Num num;

    public PrintOdd(Num num) {
        this.num = num;
    }

    public void run(){
        //打印奇数
        while (true){
            num.printOdd();
        }

    }
}

//线程2
class PrintEven implements Runnable{

    Num num;

    public PrintEven(Num num) {
        this.num = num;
    }

    public void run(){
        //打印偶数
        while (true){
            num.printEven();
        }

    }
}
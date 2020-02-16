package com.Extends;

/**
 * @author Wzy
 * @date 2020-02-08 - 14:07
 * 继承练习
 * 账户类，父类
 */
public class Account{

    private String actno;

    double balance;

    public Account(){

    }

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
}

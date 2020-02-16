package com.Extends;

/**
 * @author Wzy
 * @date 2020-02-08 - 14:08
 * 信用账户，子类
 */
public class DebitAccount extends Account{

    //信誉度
    double debit;

    public DebitAccount(){

    }

    public DebitAccount(double debit) {
        this.debit = debit;
    }

    public DebitAccount(String actno, double balance, double debit) {
        super(actno, balance);
        this.debit = debit;
    }

}

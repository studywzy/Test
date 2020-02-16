package com.CarEngine;

/**
 * @author Wzy
 * @date 2020-02-11 - 14:24
 */
public class Test {

    public static void main(String[] args) {

        Engine e = new YAMAHA();

        Car c = new Car(e);

        c.engineTest();

        c.e = new HONDA();

        c.engineTest();


    }
}

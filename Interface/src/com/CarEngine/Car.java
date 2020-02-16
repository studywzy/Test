package com.CarEngine;

/**
 * @author Wzy
 * @date 2020-02-11 - 14:04
 */
public class Car {

    Engine e;

    public Car(Engine e){//有参构造方法

        this.e = e;
    }

    //汽车测试引擎
    public void engineTest(){

        e.start();
    }

}

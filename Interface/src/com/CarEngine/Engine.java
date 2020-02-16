package com.CarEngine;

/**
 * @author Wzy
 * @date 2020-02-11 - 14:01
 * 汽车和发动机之间的接口
 * 汽车生产厂家和发动机生产厂家都面向接口生产,可替换
 */
public interface Engine {

    //所有的发动机都可以启动
    void start();
}

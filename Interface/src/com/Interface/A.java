package com.Interface;

/**
 * @author Wzy
 * @date 2020-02-11 - 12:48
 * 1.接口中只能出现常量和抽象方法
 * 2.接口其实是一个特殊的抽象类，完全抽象(只能出现常量和抽象方法)
 * 3.接口中没有构造方法，无法被实例化
 * 4.接口和接口之间可以多继承
 * 5.一个类可以实现多个接口
 * 6.一个非抽象的类实现接口需要将接口中的所有方法覆盖实现
 */
public interface A {

    //常量  public static final可以省略
    public static final  int i = 10;

    public static final String s = "xiaoming";

    double c = 3.0;

    //抽象方法 public abstract可以省略
    public abstract void m1();

    void m2();
}

interface B{
    void m1();
}

interface C{
    void m2();
}

interface D{
    void m3();
}

interface E extends B,C,D{
    void m4();
}
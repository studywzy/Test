package com.Polymorphism;

/**
 * @author Wzy
 * @date 2020-02-08 - 14:29
 * 多态测试
 */
public class PolymorphismTest {

    public static void main(String[] args) {

        //向上转型
        Pet p1 = new Dog();

        p1.eat();

        Pet p2 = new Cat();

        p2.eat();

        //向下转型
        Pet p3 = new Cat();

        ((Cat) p3).move();
        //转型必须两个类之间有继承关系！！

        //多态的应用
        Persion wang = new Persion();

        wang.feed(p1);

        wang.feed(p2);
    }
}

package com.ShoppingCart;

/**
 * @author Wzy
 * @date 2020-02-25 - 14:00
 */
public class Test {

    public static void main(String[] args) {

        //创建购物车
        ShoppingCart cart = new ShoppingCart();

        //货物
        Product p1 = new Product(1000,"iphon4s",10.0);
        Product p2 = new Product(2000,"samsung",3.0);
        Product p3 = new Product(3000,"HTC",6.0);
        Product p4 = new Product(4000,"小米",2.0);
        //购物
        cart.add(p1);
        cart.add(p4);
        cart.add(p2,3);
        cart.remove(p2,3);
        cart.add(p1,3);

        //打印详单
        cart.print();

    }
}
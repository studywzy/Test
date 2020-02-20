package com.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Wzy
 * @date 2020-02-20 - 12:24
 * 让SortedSet集合做到排序还有另一种方式：java.util.Comparator;
 * 单独编写一个比较器，推荐使用此类方法，类耦合度降低
 */
public class SortedSetTest03 {

    public static void main(String[] args) {

        //创建TreeSet集合的时候提供一个比较器
        SortedSet products = new TreeSet(new ProductComparator());

        Product p1 = new Product(3.4);
        Product p2 = new Product(4.0);
        Product p3 = new Product(2.0);
        Product p4 = new Product(3.0);
        Product p5 = new Product(5.4);

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        Iterator it = products.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}

class Product{

    double price;

    Product(double price){

        this.price = price;
    }

    public String toString(){

        return price + "";
    }
}

//单独编写一个比较器
class ProductComparator implements Comparator{

    public int compare(Object o1,Object o2){

        double price1 = ((Product)o1).price;

        double price2 = ((Product)o2).price;

        if(price1 == price2){

            return 0;

        }else if(price1 > price2){

            return 1;

        }else{

            return -1;
        }
    }

}
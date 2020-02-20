package com.Map;

import java.util.*;

/**
 * @author Wzy
 * @date 2020-02-20 - 15:14
 * SortedMap中的key特点：无序不可重复，但是存进去的元素可以按照大小自动排列
 * 如果想自动排序：key部分的元素需要实现Comparable接口或者单独写一个比较器
 */
public class SortedMapTest01 {

    public static void main(String[] args) {

        //Map，key存储Product，value存储重量
        SortedMap products = new TreeMap(new ProductComparator());

        //准备对象
        Product p1 = new Product("西瓜",1.0);
        Product p2 = new Product("苹果",4.0);
        Product p3 = new Product("桃子",5.0);
        Product p4 = new Product("香蕉",3.0);

        //添加
        products.put(p1,8.0);
        products.put(p2,3.0);
        products.put(p3,4.0);
        products.put(p4,10.0);

        Set keys = products.keySet();

        Iterator it = keys.iterator();

        while (it.hasNext()){

            Object k = it.next();
            Object v = products.get(k);
            System.out.println(k + "-->" + v);
        }

    }
}

class Product{

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString(){

        return "Product[name:" + name + " price:" + price + "]";
    }
}

class ProductComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
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



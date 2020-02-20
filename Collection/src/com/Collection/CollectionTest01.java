package com.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Wzy
 * @date 2020-02-19 - 11:35
 * boolean add (Object element); 向集合中添加元素
 *
 * void clear();清空集合
 *
 * boolean contains(Object o); 判断集合中是否包含某个元素
 *
 * Iterator iterator(); 获取集合所依赖的迭代器
 *
 * boolean remove(Object 0); 删除集合中某个元素
 *
 * int size(); 获取集合中元素的个数
 *
 * Object[] toArray(); 将集合转换成数组
 */
public class CollectionTest01 {

    public static void main(String[] args) {

        //1.创建集合
        Collection c = new ArrayList();

        //2.添加元素
        c.add(1);//JDK5.0之后自动装箱

        c.add(new Integer(100));

        Object o =new Object();

        c.add(o);

        Customer cus = new Customer("JACK",20);

        c.add(cus);

        //3.获取集合中元素的个数
        System.out.println(c.size());

        System.out.println(c.isEmpty());

        //4.将集合转换成Objct类型的数组

        Object[] obj = c.toArray();

        for(int i = 0;i < obj.length;i ++){

            System.out.println(obj[i]);
        }

        //5.清空
        c.clear();

        System.out.println(c.size());

        System.out.println(c.isEmpty());
    }
}

class Customer{

    String name;

    int age;

    Customer(String name,int age){

        this.name = name;

        this.age = age;
    }

    public String toString(){

        return "Customer[name=" + name +",age=" + age + "]";
    }
}

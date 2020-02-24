package com.Reflect;

/**
 * @author Wzy
 * @date 2020-02-24 - 10:58
 */
public class Employee {

    //Field
    private String name;

    //Constructor
    public Employee(){

        System.out.println("Employee的无参构造方法执行");
    }

    public Employee(String name){

        this.name = name;
    }

    public void work(){

        System.out.println(name + "在工作！");
    }
}

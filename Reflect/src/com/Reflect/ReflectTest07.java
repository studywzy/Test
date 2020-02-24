package com.Reflect;

import java.lang.reflect.Method;

/**
 * @author Wzy
 * @date 2020-02-24 - 23:09
 *
 * 获取某个特定的方法，通过反射机制执行
 *
 * 以前：
 * CustomerService cs = new CustomerService();
 * boolean isSuccess = cs.login("admin","123");
 *
 * 通过反射机制?
 */
public class ReflectTest07 {

    public static void main(String[] args) throws Exception{

        Class c = Class.forName("com.Reflect.CustomerService");

        //获取某个特定的方法
        //通过：方法名 + 形参列表
        Method m = c.getDeclaredMethod("login", String.class, String.class);

        //通过反射机制执行login方法
        Object o = c.newInstance();

        //调用o对象的m方法，传递"admin""123"参数，方法执行结果是retValue
        Object retValue = m.invoke(o,"admin","123");

        System.out.println(retValue);
    }
}

package com.Extends;

/**
 * @author Wzy
 * @date 2020-02-08 - 14:18
 * 继承测试类
 */
public class ExtendsTest {

    public static void main(String[] args){

        DebitAccount da = new DebitAccount();

        da.setActno("100");

        System.out.println(da.getActno());
        /**
         * 私有的属性也会继承，但要通过方法访问
         */
    }
}

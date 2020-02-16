package com.HusAndWif;

/**
 * @author Wzy
 * @date 2020-02-01 - 13:51
 * 测试
 * lalalalala
 */
public class HusAndWifeTest {

    public static void main(String[] args){

        Husband huang = new Husband();

        Wife baby = new Wife();

        huang.name = "黄晓明";

        baby.name = "杨颖";

        huang.w = baby;

        baby.h = huang;

        System.out.println("huang的名字是" + huang.name);

        System.out.println("baby的名字是" + baby.name);

        System.out.println("huang的老婆的名字是" + huang.w.name);

        System.out.println("baby的老公的名字是" + baby.h.name);

    }
}

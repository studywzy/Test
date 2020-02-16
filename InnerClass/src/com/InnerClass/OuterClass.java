package com.InnerClass;

/**
 * @author Wzy
 * @date 2020-02-13 - 10:24
 * 关于静态内部类
 * 1.静态内部类可以等同看作静态变量
 *   内部类的重要作用就是可以访问外部类私有的数据
 * 2.静态内部类可以直接访问外部类的静态数据，无法直接访问成员
 */
public class OuterClass {

    //静态变量
    private static String s1 = "A";

    //成员变量
    private String s2 = "B";

    //静态方法
    private static void m1(){
        System.out.println("static'm1 method execute");
    }

    //成员方法
    private void m2(){
        System.out.println("m2 method execute");
    }

    static class InnerClass1{

        public static void m3(){

            System.out.println(s1);

            //编译错误，无法访问成员变量
            //System.out.println(s2);

            m1();

        }

        public void m4(){

            System.out.println("m4 method execute");

            m1();
        }
    }

    /**成员内部类
     * 1.成员内部类可以等同看作成员变量
     * 2.成员内部类不能有静态声明
     * 3.成员内部类可以访问外部类所有数据
     */

    class InnerClass2{

        public void m5(){

            System.out.println(s1);

            System.out.println(s2);

            m1();

            m2();
        }
    }
    public static void main(String[] args) {

        /*
        静态内部类测试

        OuterClass.InnerClass1.m3();

        OuterClass o1 = new OuterClass();

        o1.m2();

        OuterClass.InnerClass1 i1 = new OuterClass.InnerClass1();

        System.out.println(o1.s2);

        i1.m4();
        */

        /**成员内部类测试
         * 需要先创建外部对象
         * 通过外部对象再创建内部对象
         */
        OuterClass o2 = new OuterClass();

        InnerClass2 i2 = o2.new InnerClass2();

        i2.m5();


    }

}

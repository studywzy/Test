package com.InnerClass;

/**
 * @author Wzy
 * @date 2020-02-13 - 15:19
 * 匿名内部类，内部类没有名字
 */
public class AnonymousClass {

    public static void test(CustumerService cs){

        cs.logout();
    }

    public static void main(String[] args) {

        /*
        通常使用另一个类实现接口再创建对象调用重写后的方法
        这里使用匿名内部类的方式执行test方法
        匿名内部类的优点：少定义一个类
                  缺点：无法重复使用
        */
        AnonymousClass.test(new CustumerService() {
            @Override
            public void logout() {

                System.out.println("系统退出");
            }
        });

    }
}

interface CustumerService{

    //退出系统
    void logout();
}

package com.Interface;

import com.CarEngine.Car;
import com.CarEngine.Engine;
import com.CarEngine.YAMAHA;

import java.util.Date;

/**
 * @author Wzy
 * @date 2020-02-11 - 13:34
 */
public class ServiceTest {

    public static void main(String[] args) {

        CustomerService c = new CustomerServiceImpl();//多态

        c.logout();


        B b = new Myclass();

        System.out.println(b);

        /**
         * 导包练习(导入其他包的类)
         */

        Engine e = new YAMAHA();

        Car d = new Car(e);

        d.engineTest();

        Date t = new Date();

    }
}

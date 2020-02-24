package com.IOPropertiesReflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Wzy
 * @date 2020-02-24 - 15:47
 *
 * 反射机制+IO+properties联合应用，动态创建java对象
 */
public class Test01 {

    public static void main(String[] args) {

        //1.创建属性对象
        Properties p = new Properties();

        //2.创建流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/oushinu" +
                    "/IdeaProjects/Test/Reflect/src/com" +
                    "/IOPropertiesReflect/classInfo.properties");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        //3.传输
        try {
            p.load(fis);

            if(fis != null){

                fis.close();
            }


        }catch (IOException e){
            e.printStackTrace();
        }

        String className = p.getProperty("className");//只需改动配置文件中的value
                                                      //就可获得相应的类并通过其创建对象

        System.out.println(className);

        //通过反射机制创建类对象
        Class c ;
        try {
            c = Class.forName(className);

            //通过类对象常见对象
            Object o = c.newInstance();

            System.out.println(o);


        }catch (InstantiationException | IllegalAccessException e){
            e.printStackTrace();

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

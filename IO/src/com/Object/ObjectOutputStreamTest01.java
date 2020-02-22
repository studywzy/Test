package com.Object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Wzy
 * @date 2020-02-22 - 12:18
 *
 * java.io.ObjectOutputStream; 序列化JAVA对象到硬盘（Serial）
 *
 * java.io.ObjectInputStream; 将硬盘中的JAVA对象"反序列化"到JVM内存（DeSerial）
 *
 * Compile 编译（java --> class）
 * DeCompile 反编译 (class --> java)
 *
 * 标识接口的作用：起到标识的作用
 * JVM如果看到该对象实现了某个标识接口，会对它特殊待遇
 */
public class ObjectOutputStreamTest01 {

    public static void main(String[] args) {

        //1.创建Java对象
        User u1 = new User("刘德华");

        ObjectOutputStream oos = null;

        try {
            //2.创建输出流(序列化流) （JVM中的对象状态保存到硬盘中）
            oos = new ObjectOutputStream(new FileOutputStream("/Users" +
                    "/oushinu/IdeaProjects/Test/IO/src/com/temp09"));

            oos.writeObject(u1);

            oos.flush();

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();

        }finally {
            if(oos != null){}

            try {
                oos.close();

            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}

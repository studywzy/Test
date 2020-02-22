package com.Object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Wzy
 * @date 2020-02-22 - 17:16
 *
 * 反序列化
 */
public class ObjectInputStreamTest01 {

    public static void main(String[] args) throws Exception{

        //创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users" +
                "/oushinu/IdeaProjects/Test/IO/src/com/temp09"));

        //反序列化
        Object o = ois.readObject();

        System.out.println(o);

        ois.close();
    }
}

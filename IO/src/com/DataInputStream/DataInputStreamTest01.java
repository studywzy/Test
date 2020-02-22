package com.DataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author Wzy
 * @date 2020-02-22 - 10:44
 */
public class DataInputStreamTest01 {

    public static void main(String[] args) throws Exception{

        DataInputStream dis = new DataInputStream(new FileInputStream("/Users/oushinu" +
                "/IdeaProjects/Test/IO/src/com/temp08"));

        //读
        //使用此输入流读取数据，必须提前知道该文件的存储格式，顺序
        //读的顺序必须和写入的顺序相同
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean flag = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(flag);
        System.out.println(c);

        //关闭
        dis.close();
    }
}

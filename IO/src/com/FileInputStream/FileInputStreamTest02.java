package com.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 10:34
 *
 * int read(byte[] bytes);
 *
 * 读取之前在内存中准备一个byte数组，每次读取多个字节存储到byte数组中
 * 一次读取多个字节，不是单字节读取了。
 *
 * 效率高
 */
public class FileInputStreamTest02 {

    public static void main(String[] args) {

        //1.创建输入流
        FileInputStream fis = null;

        try{
            //1.要读取某文件需要先与这个文件创建一个"输入流"
            //文件路径
            //String filepath = "temp01.rtf";//相对路径，相对于当前路径而言，在当前路径下找,不知为何报错
            //绝对路径
            String filepath = "/Users/oushinu/IdeaProjects/Test/IO/src/com/FileInputStream/temp01.rtf";

            fis = new FileInputStream(filepath);

            //2.开始读
            //准备一个byte数组
            byte[] bytes = new byte[3];//每一次最多读取三个字节

            //int read(byte[] bytes); 该方法返回的int类型的值代表的是这次读取了多少个字节
            int i1 = fis.read(bytes); //3

            System.out.println(new String(bytes));

            int i2 = fis.read(bytes); //3

            System.out.println(new String(bytes));

            int i3 = fis.read(bytes); //3

            System.out.println(new String(bytes));

            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);

        }catch (FileNotFoundException e){

            e.printStackTrace();

        }catch (IOException e){

            e.printStackTrace();
        }finally {

            if(fis != null){

                try {
                    fis.close();
                }catch (IOException e){

                    e.printStackTrace();
                }
            }

        }
    }
}

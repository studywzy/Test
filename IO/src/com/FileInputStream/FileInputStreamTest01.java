package com.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 08:47
 *
 *      java.io.InputStream;
 *          java.io.FileInputStream; //文件字节输入流
 *
 *          按照字节方式读取文件
 */
public class FileInputStreamTest01 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try{
            //1.要读取某文件需要先与这个文件创建一个"输入流"
            //文件路径
            //String filepath = "temp01.rtf";//相对路径，相对于当前路径而言，在当前路径下找,不知为何报错
            //绝对路径
            String filepath = "/Users/oushinu/IdeaProjects/Test/IO/src/com/FileInputStream/temp01.rtf";

            fis = new FileInputStream(filepath);

            //2.开始读
            int i1 = fis.read();
            int i2 = fis.read();
            int i3 = fis.read();
            int i4 = fis.read();
            int i5 = fis.read();
            int i6 = fis.read();
            int i7 = fis.read();

            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            System.out.println(i5);
            System.out.println(i6);
            System.out.println(i7);
            //如果已经读取到文件的末尾就会返回-1
            System.out.println("=======");

            int temp = 0;

            while((temp = fis.read()) != -1){

                System.out.println(temp);
            }
        }catch(FileNotFoundException e){

            e.printStackTrace();

        }catch(IOException e){

            e.printStackTrace();

        }finally {

            //为了保证流一定会释放，放进finally语句块中
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

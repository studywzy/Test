package com.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 11:17
 *
 * 循环读取
 */
public class FileInputStreamTest03 {

    public static void main(String[] args) {

        //1.创建输入流
        FileInputStream fis = null;

        //准备一个数组
        byte[] bytes = new byte[1024];//每次读取1KB

        try {
            //1.要读取某文件需要先与这个文件创建一个"输入流"
            //文件路径
            //String filepath = "temp01.rtf";//相对路径，相对于当前路径而言，在当前路径下找,不知为何报错
            //绝对路径
            String filepath = "/Users/oushinu/IdeaProjects/Test/IO/src/com/FileInputStream/FileInputStreamTest03.java";

            fis = new FileInputStream(filepath);
            /*
            while (true){

                int temp = fis.read(bytes);

                if(temp == -1) break;

                System.out.print(new String(bytes,0,temp));
            }
            */

            //升级循环

            int temp = 0;

            while ((temp = fis.read(bytes)) != -1){

                System.out.print(new String(bytes,0,temp));//此处不用加ln因为文件内本身就有换行符
            }
        }catch (FileNotFoundException e){

            e.printStackTrace();

        }catch (IOException e){

           e.printStackTrace();

        } finally {

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

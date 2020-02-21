package com.FileOutputStream;

import java.io.FileOutputStream;

/**
 * @author Wzy
 * @date 2020-02-21 - 11:47
 *
 * java.io.OutputStream;
 *      java.io.FileOutputStream; 文件字节输出流
 *
 *
 *     将计算机内存中的数据写入硬盘文件中
 */
public class FileOutputStreamTest01 {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        try{

            //1.创建文件字节输出流
            /*fos = new FileOutputStream("/Users/oushinu/IdeaProjects/Test/IO/src" +
                    "/com/FileOutputStream/temp02");//该文件不存在则自动创建,谨慎使用，会将原文件内容覆盖
            */
            //以追加的方式写入
            fos = new FileOutputStream("/Users/oushinu/IdeaProjects/Test/IO/src" +
                    "/com/FileOutputStream/temp02",true);//加一个boolean append 变量

            //2.开始写
            String msg = "HelloWorld!";

            byte[] bytes = msg.getBytes();

            //将数组中的全部数据写入
            fos.write(bytes);

            //将数组的一部分写入
            fos.write(bytes,0,3);

            //推荐最后的时候为了保证数据全部写入硬盘，所以要刷新
            fos.flush();//强制写入

        }catch (Exception e){

            e.printStackTrace();
        }finally{

            if(fos != null){

                try{
                    fos.close();

                }catch (Exception e){

                    e.printStackTrace();
                }
            }
        }
    }
}

package com.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 17:38
 *
 * 字节
 * BufferedInputStream;
 * BufferedOutputStream;
 *
 * 字符
 * BufferedReader; 带有缓冲区的字符输入流
 * BufferedReader; 带有缓冲区的字符输出流
 *
 * InputStreamReader
 * OutputStreamWriter 转换流
 */
public class BufferedReaderTest01 {

    public static void main(String[] args) {

        BufferedReader br = null;
        //创建一个带有缓冲区的字符输入流
        try {
            //将文件字符输// 入包装成带有缓冲区的字符输入流
            br = new BufferedReader(new FileReader("/Users/oushinu/IdeaProjects/Test" +
                    "/IO/src/com/BufferedReader/BufferedReaderTest01.java"));
            /*
            如果需要的是字符输入流，已有的是字节输入流，可以用InputStreamReader流进行转换
            FileInputStream fis = new FileInputStream(文件路径);
            InputStreamReader isr = new InputStreamReader(fis);//isr是字符流
            BufferedReader br = new BufferedReader(isr);
             */

            String temp;

            try {
                while ((temp = br.readLine()) != null){//br.readLine（）方法读取一行，但是行尾不带换行符

                    System.out.println(temp);
                }

            }catch (IOException e){
                e.printStackTrace();
            }

            /*
            根据流出现的位置，流又可以分为：包装流或者处理流 和 节点流
            FileReader fr 是一个节点流
            BufferedReader br 是一个包装流，或者处理流
             */
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }finally {
            if(br != null){

                //注意：关闭的时候只需要关闭最外层的包装流（这里有一个装饰者模式）
                try {
                    br.close();

                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}

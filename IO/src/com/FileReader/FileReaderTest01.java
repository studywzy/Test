package com.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 15:16
 * java.io.Reader;
 *      java.io.InputStreamReader; 转换流（字节输入流 --> 字符输入流）
 *              java.io.FileReader; 文件字符输入流
 */
public class FileReaderTest01 {

    public static void main(String[] args) {

        FileReader fr = null;
        try {
            fr = new FileReader("/Users/oushinu/IdeaProjects" +
                    "/Test/IO/src/com/FileReader/FileReaderTest01.java");

            char[] chars = new char[512];//每次1KB

            int temp = 0;

            while((temp = fr.read(chars)) != -1){

                System.out.print(new String(chars,0,temp));
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fr != null){

                try {
                    fr.close();

                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}

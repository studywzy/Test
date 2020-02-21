package com.Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 15:29
 *
 * java.io.Writer;
 *      java.io.OutputStreamWriter; 转换流（文件字节输出流 --> 文件字符输出流）
 *              java.io.FileWriter; 文件字符输出流
 */
public class FileWriterTest01 {

    public static void main(String[] args) {

        FileWriter fw = null;

        try {
            //fw = new FileWriter("/Users/oushinu/IdeaProjects" +
              //      "/Test/IO/src/com/temp04"); //覆盖
            fw = new FileWriter("/Users/oushinu/IdeaProjects" +
                    "/Test/IO/src/com/temp04",true); //追加

            fw.write("张三");//可直接写字符串

            //将char数组的一部分写入
            char[] chars = {'我','是','中','国','人','!','。','？'};

            fw.write(chars,0,4);

            fw.write("姜素丽");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw != null){

                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }



    }
}

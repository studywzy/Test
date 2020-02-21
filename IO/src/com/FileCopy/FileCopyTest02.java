package com.FileCopy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 17:09
 *
 * 文件复制
 * 只能复制纯文本
 * 使用字符输入输出流
 */
public class FileCopyTest02 {

    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;

        char[] chars = new char[512];

        try {

            //创建文件字符输入输出流
            fr = new FileReader("/Users/oushinu/IdeaProjects/Test" +
                    "/IO/src/com/temp04");
            fw = new FileWriter("/Users/oushinu/IdeaProjects/Test" +
                    "/IO/src/com/temp05");

            int temp = 0;

            while ((temp = fr.read(chars)) != -1) {//一边读一边写

                fw.write(chars, 0, temp);
            }

            //刷新
            fw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            if (fr != null) {//关闭fr

                try {
                    fr.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fw != null) {//关闭fw

                try {
                    fw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

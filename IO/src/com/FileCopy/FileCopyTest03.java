package com.FileCopy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Wzy
 * @date 2020-02-21 - 22:21
 *
 * 使用BufferedReader和BufferedWriter完成复制
 */
public class FileCopyTest03 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("/Users/oushinu" +
                "/IdeaProjects/Test/IO/src/com/temp06"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/oushinu" +
                "/IdeaProjects/Test/IO/src/com/temp07"));

        String temp;
        while((temp = br.readLine()) != null){//readline()执行成功，指针会自动下移一行

            bw.write(temp);
            if(temp != null){
                bw.newLine();
            }

        }
        bw.flush();
        br.close();
        bw.close();
    }
}

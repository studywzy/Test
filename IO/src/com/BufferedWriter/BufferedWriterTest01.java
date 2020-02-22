package com.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Wzy
 * @date 2020-02-21 - 22:06
 */
public class BufferedWriterTest01 {

    public static void main(String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/oushinu" +
                "/IdeaProjects/Test/IO/src/com/temp06",true));

        bw.write("奥运会！");

        //写入一个行分隔符
        bw.newLine();

        bw.write("开幕式一点都没意思！");

        bw.flush();
        bw.close();
    }
}

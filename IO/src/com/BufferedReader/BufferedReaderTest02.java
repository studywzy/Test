package com.BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Wzy
 * @date 2020-02-21 - 21:31
 *
 * 接受用户键盘输入
 */
public class BufferedReaderTest02 {

    public static void main(String[] args) throws Exception {//为了练习方便直接throws了，规范应该try...catch...

        /*
        //以前的方式
        Scanner s = new Scanner(System.in); //System.in是一个标准的输入流，默认接收键盘的输入

        String str = s.next(); //会以空格以分隔，如果输入hello world，其实只接收到了hello
                               //nextline(),可以接收整行

        System.out.println("您输入了: " + str);
        */

        //使用BufferedReader用来接收用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //接收输入（每一次都接收一行）
        String str = br.readLine();

        System.out.println("您输入了： " + str);

        br.close();
    }
}

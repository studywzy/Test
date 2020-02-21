package com.FileCopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-21 - 14:54
 *
 * 关于文件的复制粘贴：一边读一边写,使用字节输入输出流
 */
public class FileCopyTest01 {

    public static void main(String[] args) {

        //创建输入流
        FileInputStream fis = null;
        //创建输出流
        FileOutputStream fos = null;
        try {

            fis = new FileInputStream("/Users/oushinu/IdeaProjects/" +
                    "Test/IO/src/com/FileOutputStream/temp02");

            fos = new FileOutputStream("/Users/oushinu/IdeaProjects/" +
                    "Test/IO/src/com/temp03");

            byte[] bytes = new byte[1024]; //一次读取1024个字节

            int temp;

            while(((temp = fis.read(bytes)) != -1)){

                fos.write(bytes,0,temp);

            }

        }catch (FileNotFoundException e){

            e.printStackTrace();

        }catch (IOException e){

            e.printStackTrace();
        }finally {

            try {
                if(fis != null){

                    fis.close();
                }
                if(fos != null){

                    fos.close();
                }
            }catch (IOException e){

                e.printStackTrace();
            }
        }

    }
}

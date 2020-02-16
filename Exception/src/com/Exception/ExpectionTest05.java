package com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Wzy
 * @date 2020-02-14 - 18:55
 * 保证资源一定会被释放
 */
public class ExpectionTest05 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try{

            fis = new FileInputStream("/Users/oushinu/IdeaProjects/Test/" +
                    "Exception/src/com/Exception/ExpectionTest05.java");

        }catch (FileNotFoundException e){

            e.printStackTrace();

        }finally{

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
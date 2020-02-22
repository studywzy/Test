package com.Decorator;

/**
 * @author Wzy
 * @date 2020-02-22 - 10:02
 *
 * 使用BufferedReader对FileReader中的close方法进行扩展
 * 1.装饰者模式中要求：装饰者中含有被装饰者的引用
 * 2.装饰者模式中要求：装饰者和被装饰者应该实现同一个接口或者类型
 */
public class BufferedReader extends Reader{//装饰者

    FileReader reader;//被装饰者

    BufferedReader(FileReader reader){

        this.reader = reader;
    }

    //对FileReader中的close方法进行扩展
    public void close(){

        //扩展
        System.out.println("扩展代码1");
        reader.close();
        System.out.println("扩展代码2");
    }


}

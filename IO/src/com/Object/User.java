package com.Object;

import java.io.Serializable;//该接口是一个"可序列化"的接口
                            //该接口没有任何方法，是一个标识接口
                            //像这样的接口还有：java.lang.Cloneable; 可克隆的

/**
 * @author Wzy
 * @date 2020-02-22 - 12:22
 *
 *
 */
public class User implements Serializable {


    /**
     * 类去实现Serializable的时候最好自己给定序列化版本号，不要让系统自动生成
     * 防止以后扩展之后再反序列化出现流序列化版本号和本地文件序列化版本号不一致的情况
     */
    static final long serialVersionUID = 123231314L;

    //如果不想让该属性参与序列化，需要使用transient关键字修饰
    transient String name;

    User(String name){
        this.name = name;
    }

    public String toString(){

        return "User[name=" + name + "]";
    }
}

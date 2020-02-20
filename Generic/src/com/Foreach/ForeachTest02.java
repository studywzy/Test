package com.Foreach;

/**
 * @author Wzy
 * @date 2020-02-20 - 21:22
 *
 * 关于增强for的缺点：没有下表
 */
public class ForeachTest02 {

    public static void main(String[] args) {

        String[] ins = {"运动","音乐","旅游","美食"};

        StringBuffer sb = new StringBuffer();

        //以下程序不适合使用增强for，因为需要用到数组下标
        for(int i = 0;i < ins.length;i ++){

            if(i == ins.length - 1){

                sb.append(ins[i]);

            }else{

                sb.append(ins[i]);

                sb.append(",");
            }
        }

        System.out.println(sb);
    }
}

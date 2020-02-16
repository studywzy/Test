package com.Array;


/**
 * @author Wzy
 * @date 2020-02-16 - 10:58
 * 用数组实现一个栈
 */
public class ArraySimulateStack {

    //栈可以存储多个引用类型的元素
    Object[] obj;

    //栈的初始化容量是5
    public ArraySimulateStack(){

        this(5);
    }

    public  ArraySimulateStack(int max){

        obj = new Object[max];

    }
    int index = 0;

    //栈对外提供一个压栈的方法
    public void push(Object obj) throws StackOperationException{

        if(index == this.obj.length){

            throw new StackOperationException("栈已满");
        }

        this.obj[index ++] = obj;

    }

    //栈对外提供一个弹栈的方法
    public Object pop() throws StackOperationException{//栈顶元素往外弹

        if(index == 0){

            throw new StackOperationException("栈已空");
        }

        return (obj[-- index]);

    }
}

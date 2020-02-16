package com.Array;

/**
 * @author Wzy
 * @date 2020-02-16 - 11:02
 */
public class StackTest {

    public static void main(String[] args) {

        ArraySimulateStack stack = new ArraySimulateStack();

        StackUser u1 = new StackUser("zhang",18);

        StackUser u2 = new StackUser("wang",15);

        StackUser u3 = new StackUser("li",19);

        StackUser u4 = new StackUser("zhao",25);

        StackUser u5 = new StackUser("sun",23);

        try{

            stack.push(u1);

            stack.push(u2);

            stack.push(u3);

            stack.push(u4);

            stack.push(u5);

            //stack.push(u5);

        }catch(StackOperationException e){

            e.printStackTrace();
        }

        try{

            System.out.println(stack.pop());

            System.out.println(stack.pop());

            System.out.println(stack.pop());

            System.out.println(stack.pop());

            System.out.println(stack.pop());

            //System.out.println(stack.pop());

        }catch(StackOperationException e){

            e.printStackTrace();
        }
    }
}

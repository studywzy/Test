package com.Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Wzy
 * @date 2020-02-24 - 21:31
 *
 * java.lang.reflect.Method
 */
public class ReflectTest06 {

    public static void main(String[] args) throws Exception{

        //获取类
        Class c = Class.forName("com.Reflect.CustomerService");//想要反编译其他类中的方法
                                                               //只需要更改此处的name

        //获取所有方法
        Method[] ms = c.getDeclaredMethods();

        /*
        for(Method m:ms){

            //方法的修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + " ");
            //方法的返回值类型
            System.out.print(m.getReturnType().getSimpleName() + " ");
            //方法名
            System.out.print(m.getName() + " ");
            //形参列表
            Class[] parameterTypes = m.getParameterTypes();

            for(Class parameterType:parameterTypes){

                System.out.print(parameterType.getSimpleName() + " ");

            }
            System.out.println("\n");
        }
        */

        //反编译
        StringBuffer sb = new StringBuffer();

        sb.append(Modifier.toString(c.getModifiers()) + "class");

        sb.append(c.getSimpleName() + "{\n");

        for(Method m:ms){

            sb.append("\t");

            sb.append(Modifier.toString(m.getModifiers()) + " ");

            sb.append(m.getReturnType() + " ");

            sb.append(m.getName() + "(");

            Class[] parameterTypes = m.getParameterTypes();

            for(int i = 0;i < parameterTypes.length;i ++){

                Class parameterType = parameterTypes[i];

                if(i == parameterTypes.length - 1){

                    sb.append(parameterType.getSimpleName());

                }else {

                    sb.append(parameterType.getSimpleName() + "，");
                }

            }

            sb.append("){}\n");


        }

        sb.append("}");

        System.out.println(sb);
    }
}

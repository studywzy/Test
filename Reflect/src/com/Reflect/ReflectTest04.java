package com.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author Wzy
 * @date 2020-02-24 - 16:07
 *
 * java.lang.reflect.Field; 类中的属性
 */
public class ReflectTest04 {

    public static void main(String[] args) throws Exception{

        //获取整个类
        Class c =Class.forName("com.Reflect.User");

        //获取属性Field
        /*
        获取所有的public修饰的属性
        Field[] fs = c.getdeFields();
        System.out.println(fs.length);
        System.out.println(fs[0].getName());
         */

        /*获取所有的属性？
        Field[] fs = c.getDeclaredFields();
        for(Field field:fs){

            int i = field.getModifiers();
            String strModifier = Modifier.toString(i);
            System.out.print(strModifier + " ");

            Class type = field.getType();
            //System.out.println(type.getName());
            System.out.print(type.getSimpleName() + " ");

            System.out.print(field.getName());

            System.out.println();
        }
        输出结果：
        private String id
        public int age
        protected String addr
        boolean sex
        */

        //反编译，想要改变反编译的类只需要修改Class.forname中的类名即可

        Field[] fs = c.getDeclaredFields();

        StringBuffer sb = new StringBuffer();

        sb.append(Modifier.toString(c.getModifiers()) + "class" + c.getSimpleName() + "{" + "\n");

        for(Field field:fs){

            sb.append("\t");

            sb.append(Modifier.toString(field.getModifiers()) + " ");

            sb.append(field.getType().getSimpleName() + " ");

            sb.append(field.getName() + ";");

            sb.append("\n");
        }
        System.out.println(sb);
    }
}

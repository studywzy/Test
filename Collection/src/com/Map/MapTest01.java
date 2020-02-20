package com.Map;

import java.util.*;

/**
 * @author Wzy
 * @date 2020-02-20 - 13:43
 *
 * 关于Map集合中常用的方法
 *      void clear(); 清空Map
 *
 *      boolean containsKey(Object key); 判断Map中是否包含这样的key
 *      boolean containsValue(Object value); 判断Map中是否包含这样的value
 *
 *      Object get (Object key); 通过key获取value
 *
 *      boolean isEmpty(); 判断该集合是否为空
 *
 *      Object put(Object key,Object value); 向集合中添加键值对
 *
 *      Object remove(Object key); 通过key将键值对删除
 *
 *      int size(); 和获取Map中键值对的个数
 *
 *      Set keySet(); 获取Map中所有的key
 *
 *      Collection values(); 获取Map集合中所有的value
 *
 *      Set<Map.Entry<K,V>> entrySet(); 返回此映射中包含的映射关系的Set视图
 *

 *
 *      注意：存储在Map集合key部分的元素需要同时重写hashCode和equals方法
 */
public class MapTest01 {

    public static void main(String[] args) {

        //创建Map集合
        Map persons = new HashMap();

        //存储键值对
        persons.put("10000","JACK");
        persons.put("10011","JACK");
        persons.put("10002","SUN");
        persons.put("10003","COOK");
        persons.put("10004","KING");
        persons.put("10000","LUCY");

        //判断键值对的个数
        //Map中的key是无序不可重复的，和HashSet相同

        System.out.println(persons.size());//5,有一个key相同没加进去

        //判断集合中是否包含这样的key
        System.out.println(persons.containsKey("10000"));//true

        //判断集合中是否包含这样的value
        //注意：Map中如果key重复了，value采用的是"覆盖"
        System.out.println(persons.containsValue("LUCY"));//true

        //通过key来获取value
        Object val = persons.get("10011");

        System.out.println(val);//JACK

        //通过key删除键值对
        persons.remove("10002");

        System.out.println(persons.size());//4

        //获取所有的value
        Collection values = persons.values();

        Iterator it = values.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }

        //获取所有的key
        //如何遍历Map集合
        Set keys = persons.keySet();

        Iterator it2 = keys.iterator();

        while (it2.hasNext()){

            Object id = it2.next();

            Object name = persons.get(id);

            System.out.println(id + "-->" + name);
        }
        /*
        10000-->LUCY
        10011-->JACK
        10004-->KING
        10003-->COOK
         */

        //entrySet
        //返回此映射中包含的映射关系的Set视图
        //将Map转为Set集合
        Set entrySet = persons.entrySet();

        Iterator it3 = entrySet.iterator();

        while(it3.hasNext()){

            System.out.println(it3.next());
        }
        /*
        10000=LUCY
        10011=JACK
        10004=KING
        10003=COOK
         */

    }
}

package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Wzy
 * @date 2020-02-19 - 17:50
 * Set集合：HashSet
 * 1.HashSet底层实际上是一个HashMap，HashMap底层采用了哈希表数据结构
 * 2.哈希表又叫做散列表，哈希表底层是一个数组，这个数组每个元素都是一个单向链表。
 * 每个单向链表都有一个独一无二的hash值，代表数组的下标。在某个单向链表中的每一个
 * 节点的hash值是相等的。hash值实际上是key调用hashCode方法，再通过"hash function"
 * 转换成的值。
 * 3.如何向哈希表中添加元素
 *      先调用被存储的key的hashCode方法，经过某个算法得出hash值，如果在这个哈希表中不存在这个值
 *      则直接加入。如果该hash值已经存在，继续调用key之间的equals方法与该hash值对应的单向链表中
 *      各个节点的key比较，如果返回false，则将该元素添加，如果返回ture，则覆盖
 * 4.HashSet其实是HashMap中的key部分。HashSet有什么特点，HashMao中的key同样应该有什么什么特点
 * 5.HashMap和HashSet初始化容量都是16，默认加载因子0.75，即元素添加到达75%，集合开始扩容
 */
public class SetTest01 {

    public static void main(String[] args) {

        Set s = new HashSet();

        //无序不可重复，JDK8版java.util.HashMap内的hash算法比JDK7版的混淆程度低；
        // 在[0, 2^32-1]范围内经过HashMap.hash()之后还是得到自己。
        // 例子正好落入这个范围内，外加load factor正好在此例中让这个HashMap没有hash冲突，
        // 这就导致例中元素正好按大小顺序插入在HashMap的开放式哈希表里。

        s.add(1);
        s.add(1);
        s.add(100);
        s.add(86);
        s.add(88);

        //遍历
        Iterator it = s.iterator();

        while(it.hasNext()){

            System.out.println(it.next());//1 100 86 88
        }
    }
}

package com.AchieveLinkedList;

/**
 * @author Wzy
 * @date 2020-02-25 - 22:47
 */
public class Test {

    public static void main(String[] args) {

        AchieveLinkedList linkedList = new AchieveLinkedList();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");

        linkedList.print();

        System.out.println(linkedList.search("b"));

        System.out.println(linkedList.search("f"));

        linkedList.delete("a");

        linkedList.delete("f");

        linkedList.print();

    }
}

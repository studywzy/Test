package com.AchieveLinkedList;

/**
 * @author Wzy
 * @date 2020-02-25 - 22:46
 *
 * 实现单向链表,下面程序是存储String类型的，若要存储Object,需把String name;改成Object obj;
 */
public class AchieveLinkedList {

    //成员内部类
    class Node{

        private String name;
        private Node next;

        public Node(String name){

            this.name = name;
        }

        //添加节点
        //递归
        public void add(Node node){

            if(this.next == null){

                this.next = node;

            }else{

                this.next.add(node);
            }
        }

        //打印操作
        //递归
        public void print(){

            System.out.print(this.name + "-->");

            if(this.next != null) {

                this.next.print();
            }else{
                System.out.print("\n");
            }
        }

        //查找操作
        public boolean search(String string){

            if(this.name.equals(string)){
                return true;
            }else{
                if(this.next != null){
                    return this.next.search(string);
                }else{
                    return false;
                }
            }
        }

        //删除操作
        public void delete(String string){

            if(this.next.name.equals(string)){

                this.next = this.next.next;

            }else{

                if(this.next.next != null){

                    this.next.delete(string);
                }
            }
        }
    }

    //根节点
    private Node root;

    //添加一个节点
    public void add(String string){

        Node node = new Node(string);

        if(this.root == null){

            this.root = node;

        }else{

            this.root.add(node); //这里调用的是Node的add方法
        }
    }

    //打印节点
    public void print(){

        if(this.root != null){

            this.root.print();

        }

    }

    //查找某个节点
    public boolean search(String string){

        if(this.root != null){

            return this.root.search(string);
        }
        else{
            return false;
        }
    }

    //删除节点
    public void delete(String string){

        if(this.root.search(string)){

            if(this.root.name.equals(string)) {

                if(this.root.next != null){

                    this.root = this.root.next;

                }else{

                    this.root = null;
                }

            }else{

                this.root.delete(string);
            }

        }else{

            System.out.println("您要删除的节点不存在");
        }
    }

}

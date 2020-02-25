package com.ShoppingCart;

/**
 * @author Wzy
 * @date 2020-02-25 - 13:22
 *
 * 超市中的商品
 */
public class Product {

    //Field
    private int no;
    private String name;
    private double price;

    //Constructor
    public Product(){}

    public Product(int no, String name, double price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    //setter and getter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString
    public String toString(){
        return "Product[编号: " + no + ",名称: " + name + ",价格: " + price + "元/个]";
    }

    //hashCode
    //超市商品编号的格式：[1000-9999]
    public int hashCode(){
        return no/1000;
    }

    //equals
    //需求：如果商品编号和名字都一样表示同一种商品
    public boolean equals(Object o){

        if(this == o){
            return true;
        }
        if(o instanceof Product){

            Product p = (Product)o;

            if(p.name == this.name && p.no == this.no){

                return true;
            }

        }
        return false;
    }


}

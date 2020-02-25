package com.ShoppingCart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Wzy
 * @date 2020-02-25 - 13:57
 *
 * //购物车
 */
public class ShoppingCart {

    //使用Map存储商品条目
    Map<Product,Integer> productMaps;

    double totalPrice;

    //Constructor
    public ShoppingCart(){

        productMaps = new HashMap<Product,Integer>();

    }

    //添加1个商品
    public void add(Product p){

        add(p,1);
    }

    //添加N个商品
    public void add(Product p,int n){

        if(!productMaps.containsKey(p)){

            productMaps.put(p,n);//自动装箱

        }else{

            //车中有该商品
            int before = productMaps.get(p);//获取之前该商品的数量

            int after = before + n;

            productMaps.put(p,after);

        }
        //修改总价
        totalPrice += p.getPrice()*n;

    }

    //清空1个商品
    public void remove(Product p){

        remove(p,1);
    }
    //清空N个商品
    public void remove(Product p,int n){

        //判断该购物车中是否含有该商品
        if(!productMaps.containsKey(p)){

            System.out.println("购物车中没有该商品");

        }
        //如果购物车中的某商品数量和n是相等的，应该删除某个条目
        int before = productMaps.get(p);

        if(before == n){

            productMaps.remove(p);

            totalPrice -= p.getPrice()*n;

            return;

        }else{

            //获取之前该商品的数量
            int after = before - n;

            productMaps.put(p,after);
        }
        //修改总价
        totalPrice -= p.getPrice()*n;

    }

    //清空购物车
    public void clear(){
        productMaps.clear();
        totalPrice = 0.0;
    }

    //输出购物车详单
    /*
        格式：

        购物详单：
            10  苹果  10元
            3   西瓜  30元
            .................
                    总价：40元
     */
    public void print(){

        StringBuffer sb = new StringBuffer();

        sb.append("购物详单: \n");

        //遍历Map
        Set<Product> keys = productMaps.keySet();
        Iterator<Product> it = keys.iterator();
        while(it.hasNext()){
            Product k = it.next();
            Integer v = productMaps.get(k);
            sb.append("\t" + v + "\t" + k + "\t" + v*k.getPrice() + "\n");
        }
        sb.append(".............................................................\n");
        sb.append("\t\t\t\t\t\t\t\t\t\t\t\t总价：" + totalPrice + "元");
        System.out.println(sb);
    }
}

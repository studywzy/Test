package com.HotelManageSystem;

import java.util.Scanner;

/**
 * @author Wzy
 * @date 2020-02-15 - 22:20
 */
public class HotelOrderTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("欢迎使用酒店管理系统，酒店房间如下所示：");

        Hotel h = new Hotel();

        h.print();

        System.out.print("请输入您要预订的房间号:");

        String no = s.next();

        h.order(no);

        h.print();
    }
}

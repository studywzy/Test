package com.HotelManageSystem;

import java.util.Scanner;

/**
 * @author Wzy
 * @date 2020-02-16 - 13:11
 * 没有连数据库，无房可退
 */
public class HotelLeaveTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Hotel h = new Hotel();

        System.out.print("请输入您要退房的房间号：");

        String no = s.next();

        h.leave(no);

        h.print();
    }
}

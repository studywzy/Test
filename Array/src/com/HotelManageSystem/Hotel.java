package com.HotelManageSystem;

/**
 * @author Wzy
 * @date 2020-02-15 - 22:20
 */
public class Hotel {

    Room[][] rooms;

    //默认酒店五层楼每层十个房间
    //1，2层是标准间
    //3，4层是双人间
    //5是豪华间
    public Hotel(){

        this(5,10);
    }

    public Hotel(int rows,int cols){//构造酒店

        rooms = new Room[rows][cols];

        for(int i = 0;i < rooms.length;i ++){

            for(int j = 0;j < rooms[i].length;j ++){

                if(i == 0 || i == 1){

                    rooms[i][j] = new Room(((i + 1) *100) + j + 1 + "","标准间",false);
                }

                if(i ==2 || i ==3){

                    rooms[i][j] = new Room(((i + 1) *100) + j + 1 + "","双人间",false);
                }

                if(i ==4){

                    rooms[i][j] = new Room(((i + 1) *100) + j + 1 + "","豪华间",false);
                }
            }
        }
    }

    //对外提供一个打印酒店房间列表的方法
    public void print(){

        for(int i = 0;i < rooms.length;i ++) {

            for (int j = 0; j < rooms[i].length; j++) {

                System.out.print(rooms[i][j]);
            }
            System.out.println();//输出一层后换行
        }

    }

    //对外提供一个订房，房的isUsed属性变false
    public void order(String no){

        for(int i = 0;i < rooms.length;i ++) {

            for (int j = 0; j < rooms[i].length; j++) {

                if(rooms[i][j].getNo().equals(no)){

                    rooms[i][j].setUsed(true);

                    return;
                }
            }
        }

    }

    //对外提供一个退房方法
    public void leave(String no){

        for(int i = 0;i < rooms.length;i ++) {

            for (int j = 0; j < rooms[i].length; j++) {

                if(rooms[i][j].getNo().equals(no)){

                    rooms[i][j].setUsed(false);

                    System.out.println("您已退房成功");

                    return;
                }
            }
        }

    }

}

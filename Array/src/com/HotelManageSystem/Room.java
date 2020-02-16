package com.HotelManageSystem;

/**
 * @author Wzy
 * @date 2020-02-15 - 22:19
 * 酒店的房间
 */
public class Room {

    private String no;//房间号

    private String type;//房间类型"标准间""双人间""豪华间"

    private boolean isUsed;//true表示已占用，false表示空房

    public Room(String no, String type, boolean isUsed) {
        this.no = no;
        this.type = type;
        this.isUsed = isUsed;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public String toString(){

        return "[" + no + "," + type + "," + (isUsed ? "占用":"空闲") + "]";
    }
}

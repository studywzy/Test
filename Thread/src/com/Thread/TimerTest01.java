package com.Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Wzy
 * @date 2020-02-24 - 10:23
 *
 * 关于Timer计时器
 */
public class TimerTest01 {

    public static void main(String[] args) {

        //1.创建定时器
        Timer t = new Timer();

        //2.指定定时任务
        try {
            t.schedule(
                    new LogTimerTask(),
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2020-02-24 10:34:00 000"),
                    10 * 1000);

        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}

//指定任务
class LogTimerTask extends TimerTask{

    public void run(){

        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS").format(new Date()));
    }
}

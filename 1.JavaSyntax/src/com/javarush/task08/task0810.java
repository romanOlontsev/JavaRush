package com.javarush.task08;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/*
Таймер
*/

public class task0810 {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);

        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}


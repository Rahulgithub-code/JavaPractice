package com.practice;

import java.util.Calendar;
import java.util.TimeZone;

public class Calender_Class_Example {
    /*
    Calender class is a abstract class.
    Calender type is gregory calender.
     */
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
    }
}

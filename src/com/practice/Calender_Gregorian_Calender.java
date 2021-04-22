package com.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calender_Gregorian_Calender {
    public static void main(String[] args) {
        // Calender is abstract class.
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) +":"+
                           calendar.get(Calendar.MINUTE)+ ":"+
                           calendar.get(Calendar.SECOND));

        /*
        GregorianCalendar is concrete class.
         */
        GregorianCalendar gCalender  = new GregorianCalendar();
        System.out.println(gCalender.isLeapYear(2021));
        System.out.println(gCalender.getTime());

        // TimeZone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[30]);
    }
}

package com.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();  // This is date.
        System.out.println(dt);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // This is user defined formatter.
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE; // Predefined formatter.
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy --E a"); // This is user defined formatter.

        String myDate1 = dt.format(dtf1);
        System.out.println(myDate1);
        String myDate2 = dt.format(dtf2);
        System.out.println(myDate2);
        String myDate3 = dt.format(dtf3);
        System.out.println(myDate3);

    }
}

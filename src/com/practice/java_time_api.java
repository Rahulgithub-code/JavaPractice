package com.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_time_api {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }

}

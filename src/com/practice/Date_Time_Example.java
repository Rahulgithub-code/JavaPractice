package com.practice;

public class Date_Time_Example {
    public static void main(String[] args) {
        /*
        Data in java is stored in the form of a long number.
        This long number holds the number of millisecond passed since 1 Jan 1970.

        Java assume that 1900 is the start year (Base year of Java).
         */
        System.out.println(System.currentTimeMillis());
        System.out.println("Year since 1970 : "+System.currentTimeMillis()/1000/3600/24/365+" Year");

    }
}

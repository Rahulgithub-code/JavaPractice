package com.practice;

import java.util.Scanner;

public class try_catch_nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=12;
        arr[2]=61;
        System.out.println("Enter index : ");
        int index = sc.nextByte();
        try {
            System.out.println("Welcome");
            try {
                System.out.println(arr[index]);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Index out of bond, please give index in range between (0-2)");
                System.out.println("Exception level 2");
            }

        }
        catch (Exception e){
            System.out.println("Exception level 1");
        }
    }
}

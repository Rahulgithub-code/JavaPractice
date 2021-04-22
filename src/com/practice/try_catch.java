package com.practice;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextByte();
        //System.out.println("Result : "+1000/k);
        try {
            int c = 1000/k;
            System.out.println("Result : "+c);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("End of the program."); // run -> when we apply try catch

    }
}

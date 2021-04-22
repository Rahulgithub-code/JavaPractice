package com.practice;

import java.util.Scanner;

class MaxRetriesReachException extends Exception{
    @Override
    public String toString() {
        return "You exceed your limit.";
    }

    @Override
    public String getMessage() {
        return "You exceed your limit.";
    }
}

public class Set11_ErrorAndException {
    public static void meth() throws MaxRetriesReachException{
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=12;
        arr[1]=15;
        arr[2]=17;
        arr[3]=19;
        arr[4]=23;
        int i=0;
        while (flag && i<5 ){
            System.out.print("Enter index size : ");
            int index = sc.nextByte();
            try {
                System.out.println(arr[index]);
                break;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if (i==5){
            throw new MaxRetriesReachException();
        }
    }
    public static void main(String[] args) {
        /* Question 2
        try {
            int a =666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("He He");
        }
        catch (ArithmeticException a){
            System.out.println("Ha Ha");
        }
         */



        /* Question 3
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=12;
        arr[1]=15;
        arr[2]=17;
        arr[3]=19;
        arr[4]=23;
        int i=0;
        while (flag && i<5 ){
            System.out.print("Enter index size : ");
            int index = sc.nextByte();
            try {
                System.out.println(arr[index]);
                break;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if (i==5){
            System.out.println("Limit exceed.");
        }
         */



        /* Question 4
        if(i==5){
            try {
                throw new MaxRetriesReachException();
            }
            catch (MaxRetriesReachException m){
                System.out.println(m.getMessage());
            }

        }
         */

        /* Question 5
        try {
            meth();
        }
        catch (MaxRetriesReachException e){
            System.out.println(e.getMessage());
        }
         */
    }
}

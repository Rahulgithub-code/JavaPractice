package com.practice;

import java.util.Scanner;

public class Set1 {
    public static void main(String[] args) {
        /* Question1
        System.out.println("Sum of three number's-");
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        int sum=0;
        System.out.print("Enter 1st number :");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number :");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd number :");
        num3 = sc.nextInt();
        sum = num1+num2+num3;
        System.out.print("Total :"+ sum);
         */
        /* Question 2

        System.out.println("CGPA of three subject-");
        Scanner sc= new Scanner(System.in);
        int sub1,sub2,sub3;
        float cgpa;
        System.out.print("Enter sub1 marks :");
        sub1 = sc.nextInt();
        System.out.print("Enter sub2 marks :");
        sub2 = sc.nextInt();
        System.out.print("Enter sub3 marks :");
        sub3 = sc.nextInt();
        cgpa = (float) (sub1+sub2+sub3)/30;
        System.out.print("CGPA is :"+ cgpa);
         */

        /* Question 3
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Hello " + str +" have good day.");
         */

        /* question 4
        System.out.print("Enter a number in KM :");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float mile = 1.609344f;
        float result = km/mile;
        System.out.format("Mile : %.1f",result);
         */

        /*
        System.out.print("Enter your number :");
        Scanner sc = new Scanner(System.in);
        boolean isInt = sc.hasNextInt();
        if(isInt){
            System.out.println("Entered number a Integer.");
        }
        else{
            System.out.println("Entered number not a Integer.");
        }
         */
    }
}

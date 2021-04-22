package com.practice;

import java.util.Scanner;

public class Set4_Condition {
    public static void main(String[] args) {
        /* Question 1
        int a = 11;
        if(a=11){  //int is not assign in boolean.
            System.out.println("I'm 11.");
        }
        else{
            System.out.println("I'm not 11.");
        }
         */

        /* Question 2
        int sub1, sub2,sub3;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your sub1 marks :");
        sub1=sc.nextInt();
        System.out.print("Enter your sub2 marks :");
        sub2=sc.nextInt();
        System.out.print("Enter your sub3 marks :");
        sub3=sc.nextInt();
        float per = (float) ((sub1+sub2+sub3)*100)/300;
        //System.out.format("%.2f",per);
        if(per>=40 && (sub1>=33 && sub2>=33 && sub3>=33)){
            System.out.println("You are Pass.");
        }
        else{
            System.out.println("You are not pass, try again.");
        }
         */

        /* Question 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your amount is Lakh's : ");
        float tax= 0;
        float income = sc.nextFloat();
        if(income<2.5f){
            tax = tax+0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if(income>5f && income<=10f){
            tax = tax + 0.05f * (5f-2.5f);
            tax = tax + 0.2f * (income-5f);
        }
        else if(income>10f){
            tax = tax + 0.05f * (5f-2.5f);
            tax = tax + 0.2f * (5f-10f);
            tax = tax + 0.3f * (income-10f);
        }
        System.out.println("Tax is : "+ tax);
         */

        /* Question 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. :");
        byte day = sc.nextByte();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 2 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
         */
        /* Question 6
        System.out.print("Enter your website :");
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        if(str.endsWith(".org")){
            System.out.print("This is Organisation website");
        }
        else if(str.endsWith(".com")){
            System.out.print("This is Commercial website");
        }
        else if(str.endsWith(".in")){
            System.out.print("This is an Indian website");
        }
        else{
            System.out.println("Enter valid website address.");
        }
         */

        /* Question 7
        System.out.print("Enter a year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println(year+" is Leap year.");
        }
        else if(year % 4 == 0){
            System.out.println(year+" is Leap year.");
        }else if(year % 100 == 0){
            System.out.println(year+" is not a  Leap year.");
        }
        else{
            System.out.println(year+" is not a  Leap year.");
        }
         */
    }
}

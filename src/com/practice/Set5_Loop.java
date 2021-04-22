package com.practice;

import java.util.Scanner;

public class Set5_Loop {
    public static void main(String[] args) {
        /* Question 1
        int n = 4;
        for (int i=n; i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

         /* Question 2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<n; i++){
            int even= 2*i;
            sum = sum+even;
        }
        System.out.println(sum);
          */
      /*  Question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        for(int i =1 ; i<=10;i++){
            System.out.format("%d x %d = %d \n",n,i,n*i);
        }
       */

         /*  Question 4
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter any number");
               int n = sc.nextInt();
               for(int i=10; i>=1; i--){
                   System.out.format("%d x %d = %d \n",n,i,n*i);
               }
          */

                /*  Question 5
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter any number");
               int n = sc.nextInt();
               int fact=1;
               for(int i=1; i<=n; i++ ){
                   fact = fact *i;
               }
                System.out.println(fact);
                 */

        /*  Question 6
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter any number");
               int n = sc.nextInt();
               int fact=1;
               int i=1;
               while(i<=n){
                   fact = fact *i;
                   i++;
               }
        System.out.println(fact);
         */

        /* Question 7
        int n = 4;
        for (int i=n; i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
         */
         /* Question 8
        int n=4;
        while(n>=1){
            int m=n;
            while (m>0){
                System.out.print("* ");
                m--;
            }
            System.out.println("");
            n--;
        }
          */

        // /* Question 9
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + (8 * i);
        }
        System.out.println(sum);
    }
}

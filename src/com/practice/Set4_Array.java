package com.practice;

public class Set4_Array {
    public static void main(String[] args) {
        /* Question 1

       float[] arr = {1.2f,12.3f,55.3f,1.3f,5.3f,0.1f,6.1f};
       float sum = 0;
       for(int i =0; i<arr.length;i++){
           sum = sum + arr[i] ;
           System.out.println(arr[i]);
       }
        System.out.printf("%.1f", sum);
         */

        /* Question 2

        int[] num = {5,4,7,8,9,1,2};
        int value = 81;
        boolean isInArray = false;
        for(int i =0; i<num.length;i++){
            if(value==num[i]){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("Value is present is in array.");
        }
        else{
            System.out.println("Value is not present is in array.");
        }
         */

        /* Question 3
        float[] marks = {68.3f, 70.3f, 66.5f, 69.9f, 65.3f, 65.2f};
        float sum = 0f;
        for (float element:marks) {
            sum  = sum+element;
        }
        System.out.printf("Average of marks is %.2f", (sum/ marks.length));
         */

        /* Question 4
        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{7, 2, 2},
                        {5, 2, 3}};

        int[][] result = { {0,0,0},{0,0,0,} };

        for(int i=0; i< mat1.length;i++){
            for(int j=0; j< mat1[i].length;j++){
                result[i][j] = mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
         */
        /* Question 5
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int mid = (arr.length)/2;
        int l = arr.length;
        int mid = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i <= mid; i++) {
                temp = arr[i];
                arr[i] = arr[l-i-1];
                arr[l-i-1]=temp;
        }
        for (int element:arr){
            System.out.println(element);
        }
         */

        /* Question 6
        int[] arr = {1, 2, 333, 4, 5, 6, 7, 8, 9};
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(max);
         */
        /* Question 7
        int[] arr = {1, 2, 333, 4, 5, 6, 7, 8, 9};
        int min = Integer.MAX_VALUE;
        for (int e : arr) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println(min);
         */

        /* Question 8
        int[] arr = {1, 12, 3, 4, 5, 6, 7, 8, 9};
        boolean isSorted = false;
        for (int i=0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = true;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }
         */
    }
}
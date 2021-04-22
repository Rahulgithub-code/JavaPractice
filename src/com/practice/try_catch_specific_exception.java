package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_specific_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=12;
        arr[2]=61;

        try {
            System.out.print("Enter the array index :");
            int index = sc.nextByte();
            System.out.print("Enter the number you want to divide the value with :");
            int number = sc.nextByte();
            System.out.println("The value at index entered is : "+ arr[index]);
            System.out.println("The value of array-value/number is :" + arr[index]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bond Exception occurred");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurred");
        }
        catch (InputMismatchException e){
            System.out.println("Wrong value enter occurred");
        }
        catch (Exception e){
            System.out.println("Some exception occurred");
        }

    }
}

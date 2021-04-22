package com.practice;

public class Set6_Methods {
    static void Multiple(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d \n", n, i, n * i);
        }
    }

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    static int NaturalNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + NaturalNum(n - 1);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    // 0 1 1 2 3 5 8 13
    static int fibona(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        /*
        if (n == 1 || n == 2) {
            return n - 1;
        }
         */
        else {
            return fibona(n - 1) + fibona(n - 2);
        }
    }

    static float Avg(int... n) {
        float sum = 0;
        float length = n.length;
        for (int j : n) {
            sum = sum + j;
        }

        return sum / length;
    }

    static float calcToFahre(float n) {
        return n * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        /* Question 1
        Multiple(5);
         */

        /* Question 2
        pattern(10);
         */

        /* Question 3
        int c = NaturalNum(3);
        System.out.println(c);
         */

        /* Question 4
        pattern1(10);
         */

        /* Question 5
        int c = fibona(6);
        System.out.println(c);
         */

        /* Question 6
        float c = Avg(1,2,3);
        System.out.println(c);
         */

        /* Question 7
        float calc = calcToFahre(51);
        System.out.println(calc+" F");
         */
    }
}

package com.practice;

import java.util.ArrayDeque;

public class Array_Deque_Example {
    public static void main(String[] args) {
        /*
        Array Double ended queue.
        add element from both side (first or last).
         */
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(7);
        ad1.add(8);
        ad1.addFirst(5);
        ad1.addLast(9);
        for (int item: ad1) {
            System.out.print(item);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}

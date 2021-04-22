package com.practice;
import java.util.LinkedList;

public class LinkedList_Example {
    public static void main(String[] args) {
        /*
        ArrayList is good for searching or accessing because of its index.
        LinkedList is good for delete, add.
         */
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>(); // initial capacity not valid in LinkedList.
        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(44);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(1);
        l1.add(0,0); // add on specific index.
        // l1.addAll(l2);  // append array.
        l1.addAll(0,l2); // append array with specific index.
        // l1.clear();  // clean array
        l1.set(1,222);  // replace item in specific index.
        l1.addLast(2); // Add element in last position on LinkedList.
        l1.addFirst(101); // Add element in first position on LinkedList.
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println(l1.contains(22)); // search item by element.
        System.out.println(l1.indexOf(1));  // find index of element.
        System.out.println(l1.lastIndexOf(1));
    }
}

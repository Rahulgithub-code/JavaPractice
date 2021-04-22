package com.practice;

import java.util.HashSet;

public class Hash_Set_Example {
    public static void main(String[] args) {
        /*
        Hashing technique will store element in the form of key-value pair.
        Hashing will use chaining technique for hash collision problem.
         */
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        myHashSet.add(55);
        System.out.println(myHashSet);
    }
}

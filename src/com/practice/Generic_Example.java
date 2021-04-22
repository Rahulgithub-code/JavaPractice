package com.practice;

import java.util.ArrayList;

//generic class
class myGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public T2 getT2() {
        return t2;
    }

    public T1 getT1() {
        return t1;
    }
}

public class Generic_Example {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        // ArrayList<int> arrayList1 = new ArrayList(); // not allowed, because int is a primitive data type.
        //arrayList.add("AC");
        arrayList.add(12);
        arrayList.add(22);

        // int a = arrayList.get(1); // cant do, compile time error
        // int a = (int) arrayList.get(1); //Without generic
        // int a = (int) arrayList.get(0); // run time error because of its type.
        int a = arrayList.get(1);
        System.out.println(a);

        //Custom generic class
        myGeneric<String, Integer> mg = new myGeneric(12,"Rahul ", 22);
        String str = mg.getT1();
        Integer int1 = mg.getT2();
        System.out.println(str  + int1);
    }
}

package com.practice;

interface demo{
    public void meth1();
    public void meth2();
}

public class AnonymousClass_Example {
    public static void main(String[] args) {
        //Anonymous Class
        demo obj = new demo() {
            @Override
            public void meth1() {
                System.out.println("Meth 1");
            }

            @Override
            public void meth2() {
                System.out.println("Meth 1");
            }
        };
        obj.meth1();

    }
}

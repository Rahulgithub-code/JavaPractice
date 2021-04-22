package com.practice;
@FunctionalInterface
interface AnonymousInterface{
    void sum(int a, int b);
}

public class AnonymousMethod_or_LambdaExp_Example {
    /*
    Lambda expression is a one line method or without it's name.
     */
    public static void main(String[] args) {
        AnonymousInterface ai = (a,b) ->{
            System.out.println(a+b);
        };
        ai.sum(12,12);
    }
}

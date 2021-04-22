package com.practice;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int a=0;
        while(a<40000){
            System.out.println("I'm Chatting with her.");
            System.out.println("I'm happy.");
            a++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int a=0;
        while(a<40000){
            System.out.println("Thread2 is cooking");
            System.out.println("I'm sad.");
            a++;
        }
    }
}

public class ThreadByExtending {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

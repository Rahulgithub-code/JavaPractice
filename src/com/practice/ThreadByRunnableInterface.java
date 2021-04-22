package com.practice;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int a=0;
        while (a<20000){
            System.out.println("Runnable thread from Thread1");
            a++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int a=0;
        while (a<20000){
            System.out.println("Runnable thread from Thread2");
            a++;
        }
    }
}

public class ThreadByRunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1= new MyThreadRunnable1();
        MyThreadRunnable2 bullet2= new MyThreadRunnable2();
        //bullet1.start(); you have to set thread before applying runnable thread
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();




    }
}

package com.practice;

class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thread");
    }
}

public class ThreadWithConstructors {
    public static void main(String[] args) {
        MyThr t = new MyThr("Rahul");
        System.out.println(t.getName());
        System.out.println(t.getId());
        t.start();
    }
}

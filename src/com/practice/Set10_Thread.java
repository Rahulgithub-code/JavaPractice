package com.practice;

class Thread1 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good Morning");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Welcome");
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Set10_Thread {
    public static void main(String[] args) {
        /* Question1
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
         */
        /* Question 2
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
         */
        /* Question 3
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        Normal priority -> 5
        Max priority -> 10
        Min priority -> 1
         */
        /* Question 4
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.println(t1.getState());
         */
    }
}

package com.practice;

@FunctionalInterface
interface myFunctionalInterface {
    /*
    functional interface: Only one abstract method is allowed in @FunctionalInterface.
     */
    void add(int a, int b);


}

class MyPhone extends Phone{
    @Override  // Override annotation.
    void On() {
        System.out.println("Phone is ON.");
    }

    @Deprecated  // Deprecated method
    public  int sum (int a, int b){
        return a+b;
    }
}

public class Annotation_Example {
    @SuppressWarnings("deprecation") //Remove deprecated warning's.
    public static void main(String[] args) {
        /*r
        Annotation : Meta data of class/method.
         */
        MyPhone myPhone = new MyPhone();
        myPhone.On();
        myPhone.sum(3,4);
    }
}

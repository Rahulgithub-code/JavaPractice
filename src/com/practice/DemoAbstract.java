package com.practice;

abstract class Parent{
   public Parent(){
        System.out.println("I am constructor from Parent Class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning. . .");
    }
}

abstract class GrandChild extends Parent{
    public void th (){
        System.out.println("th");
    }
}

public class DemoAbstract {
    public static void main(String[] args) {
        Child child= new Child();
        child.greet();
        /*
        Abstract : Existing in thought or an idea but without concrete existence.
        Abstract method : Declare without an implementation.
        Abstract class : If a class include abstract method then the class itself
                         must be declare abstract.
                         Abstract class can not be instantiated directly.
         */
    }
}

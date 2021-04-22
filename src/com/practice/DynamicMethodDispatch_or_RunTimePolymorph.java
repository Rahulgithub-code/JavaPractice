package com.practice;

class Phone {
    void On() {
        System.out.println("Phone is turning on");
    }
}

class SmartPhone extends Phone {
    @Override
    void On() {
        System.out.println("SmartPhone is turning on");
    }

    void music() {
        System.out.println("SmartPhone playing music");
    }
}

public class DynamicMethodDispatch_or_RunTimePolymorph {
    public static void main(String[] args) {
        Phone obj = new SmartPhone(); //Its allowed
        obj.On();
        //SmartPhone obj1 = new Phone(); //Not Allowed

    }
}

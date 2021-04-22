package com.practice;

abstract class Pen {
    abstract void write();

    abstract void refile();
}

class FountainPen extends Pen {
    public void write() {
        System.out.println("Write");
    }

    public void refile() {
        System.out.println("Refile");
    }

    public void changeNib() {
        System.out.println("Changing the Nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jump");
    }

    void bite() {
        System.out.println("Bite");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void speak() {
        System.out.println("Hello World!");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone1 extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("Answering the call");
    }
    public void disconnect(){
        System.out.println("Call disconnected");
    }
    public void camera(){
        System.out.println("Camera");
    }
    public void wifi(){
        System.out.println("Wifi");
    }
}

interface TVRemote{
    void On();
    void Off();
    void VolumeIncDec();
    void ChannelChange();
}
interface SmartTvRemote extends TVRemote {
    void Netflix();
}

class TV implements TVRemote{
    @Override
    public void On() {
        System.out.println("Turning On");
    }

    @Override
    public void Off() {
        System.out.println("Turning off");
    }

    @Override
    public void VolumeIncDec() {
        System.out.println("Volume increase decrease");
    }

    @Override
    public void ChannelChange() {
        System.out.println("Changing channel");
    }
}
public class Set9_AbstractAndInterface {
    public static void main(String[] args) {
        /* Question 1 & 2
        FountainPen pen = new FountainPen();
        pen.refile();
         */
        /* Question 3
        Human human = new Human();
        human.sleep();
         */
        /* Question 5 (Demonstrate of Polymorphism)
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        //m1.sleep(); --> Cannot use sleep method because the reference is Monkey which doesn't have sleep() method.
        BasicAnimal b = new Human();
        b.eat();
        b.sleep();
        //b.speak(); --> Does not have speak in BasicAnimal interface.
         */
        /* Question 4 Demonstrate of Polymorphism
        Telephone t = new SmartPhone1();
        t.disconnect();
        t.lift();
        t.ring();
        //t.carema(); --> Not allowed
         */
        TV tv = new TV();
        tv.On();
    }
}

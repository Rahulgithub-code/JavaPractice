package com.practice;

class Circle{
    public int radius;

    Circle(int r){
        this.radius=r;
    }

    public double areaOfCircle(){
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle{
    private int height;
    Cylinder(int r, int h){
        super(r);
        this.height=h;
    }
    public double areaOfCylinder(){
        return (2*Math.PI*this.radius*height)+(2*Math.PI*this.radius*this.radius);
    }
}

public class Set8_Inheritance {
    public static void main(String[] args) {
        /* Question 1
        Circle circle = new Circle(4);
        System.out.println(circle.areaOfCircle());
        Cylinder cylinder=new Cylinder(4,4);
        System.out.println(cylinder.areaOfCylinder());
         */
    }
}

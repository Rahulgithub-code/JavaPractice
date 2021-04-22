package com.practice;

class Clinder {
    private float radius;
    private float height;
    private double pi = Math.PI;

    public Clinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    void setRadius(float radius) {
        this.radius = radius;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getRadius() {
        return radius;
    }

    float getHeight() {
        return height;
    }

    public double SurfaceArea(float radius, float height) {
        return (2 * pi * radius * height) + (2 * pi * radius * radius);
    }

    public double Volumn(float radius, float height) {
        return pi * radius * radius * height;
    }

}

public class Set7_AccessModifierAndConstructor {
    public static void main(String[] args) {
        /* Question 1
        Clinder obj=new Clinder();
        obj.setRadius(3);
        System.out.println(obj.getRadius());
        obj.setHeight(22);
        System.out.println(obj.getHeight());
         */
        /* Question 2
        Clinder clinder = new Clinder();
        System.out.format("%.2f \n",clinder.SurfaceArea(3,3));
        System.out.format("%.2f",clinder.Volumn(3,3));
         */

        /* Question 3
        Clinder clinder = new Clinder(3,3);
        System.out.format("%.2f \n",clinder.SurfaceArea(3,3));
         */

    }
}

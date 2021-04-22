package com.practice;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can't be negative.";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative.";
    }
}
public class throw_and_throws {
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        /*
        throw => explicitly throw exception.
        throws => Gives information to the programmer for exception.
         */
        try {
            int res=divide(4,1);
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

        //Example 2
        try {
            double ar = area(-1);
            System.out.println(ar);
        }
        catch (NegativeRadiusException e){
            System.out.println(e.getMessage());
        }

    }

}

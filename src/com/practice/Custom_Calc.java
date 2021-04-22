package com.practice;
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Can not operation with 8 or 9 value.";
    }

    @Override
    public String getMessage() {
        return "Can not operation with 8 or 9 value.";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Can not divide with zero.";
    }

    @Override
    public String getMessage() {
        return "Can not divide with zero.";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Given value is more than 10000.";
    }

    @Override
    public String getMessage() {
        return "Given value is more than 10000.";
    }
}
class Calculator {
    double add(double a, double b) throws InvalidInputException{
        if(a==9 || b==9 || a==8 || b==8){
            throw new InvalidInputException();
        }
        else {
            return a+b;
        }
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a>10000 || b>10000){
            throw new MaxInputException();
        }
        else {
            return a-b;
        }
    }
    double multiply(double a, double b){
        return a*b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException{
        if (b==0){
            throw new CannotDivideByZeroException();
        }
        else{
            return a/b;
        }
    }
}

public class Custom_Calc {

    public static void main(String[] args) throws InvalidInputException , CannotDivideByZeroException ,MaxInputException{
        Calculator c =new Calculator();
        //c.add(9,8);
        //c.divide(10,0);
        c.subtract(12,10001);
    }
}

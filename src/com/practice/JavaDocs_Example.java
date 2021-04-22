package com.practice;

/**
 * This class is to demonstrate what javadoc is how it is used in industry
 * This is <i>italic</i> word
 * <p>This is paragraph</p>
 * @author Rahul
 * @version 1.0.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">
 *     JavaDocs </a>

 */
public class JavaDocs_Example {
    /**
     *
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Sum of two number as an integer
     */
    public int add(int a, int b){
        return a+b;
    }

    /**
     *
     * @param a This is the first number to divide
     * @param b This is the second number to divide
     * @return Division of two number as an integer
     * @throws Exception if b is 0.
     */
    public int divide(int a, int b) throws Exception{
        if (b==0){
            throw new Exception();
        }
        else{
            return a/b;
        }
    }

    /**
     * Hello this method of multiply of two number.
     * @param a This is the first number to multiple
     * @param b This is the second number to multiple
     * @return multiple of two number as an integer
     * @deprecated This method is deprecated please use * operator.
     */
    public int multiple(int a, int b){
        return a*b;
    }

    /**
     *
     * @param args These are arguments supplied to the command line.
     */
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}

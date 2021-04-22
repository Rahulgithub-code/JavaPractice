package com.practice;

public class Finally_block {
    public static int greet(){
        try {
            int a=8;
            int b=0;
            return a/b;
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            //Always run even already return.
            System.out.println("End of the program.");
        }
        return 0;
    }
    public static void main(String[] args) {
        int res = greet();
        System.out.println(res);

        //Example 2
        int a = 10;
        int b=9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Yes ! I' am Finally for value : " + b);
            }
            b--;
        }

        //Example 3
        try {
            System.out.println(3/1);
        }
        finally {
            System.out.println("Yes ! I'm finally.");
        }

    }
}

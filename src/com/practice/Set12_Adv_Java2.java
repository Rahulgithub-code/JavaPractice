package com.practice;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class myDeprecated {
    @Deprecated
    void meth1() {
        System.out.println("Hello world");
    }
}

@FunctionalInterface
interface MyInt {
    void display();
}

public class Set12_Adv_Java2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        myDeprecated myDeprecated = new myDeprecated();
        myDeprecated.meth1();
        MyInt m = new MyInt() {
            @Override
            public void display() {
                System.out.println("Hello World");
            }
        };

        String file_name="MultiplyTable.txt";
        File myFile = new File(file_name);

        // Creation of file.
        try {
            myFile.createNewFile();
            System.out.println("File is successfully created.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Writing in file.
        try {
            FileWriter fileWriter = new FileWriter(file_name);
            for (int i=1; i<=10; i++){
                fileWriter.write("5 x "+i +" = "+5*i +"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

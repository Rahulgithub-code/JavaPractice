package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling_Example {
    public static void main(String[] args) {
        File myFile = new File("JavaFileDemo.txt");

        //Code To create to new file in java.
        /*
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }

        // Code to write in file.
        try {
            FileWriter fileWriter = new FileWriter("JavaFileDemo.txt");
            fileWriter.write("Hello guys this is our first file. \n Okay now bye.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Code for reading a file
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
         */

        
        // Code for delete file.
        try {
            if (myFile.delete()){
                System.out.println("I Have deleted " + myFile.getName());
            }
            else{
                System.out.println("Some error will occur.");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

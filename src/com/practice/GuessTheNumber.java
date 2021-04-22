package com.practice;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int number;
    private int input_number;
    private int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guess number : ");
        this.input_number = sc.nextInt();
    }

    boolean isCorrectNumber() {
        this.noOfGuesses++;
        if (input_number == number) {
            System.out.format("Yes you guessed it right, is was %d\nYou guessed it in %d attempts.",number, noOfGuesses);
            return true;
        } else if (input_number < number) {
            System.out.println("Given number is low");
        } else if (input_number > number) {
            System.out.println("Given number is high");
        }
        return false;
    }

}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game game = new Game();
        boolean stop=false;
        while (!stop){
            game.takeUserInput();
            stop=game.isCorrectNumber();

        }


    }
}

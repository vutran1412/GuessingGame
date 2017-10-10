package com.vu;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {


        Random rand = new Random();
        int guessNumber = rand.nextInt(501);
        int numOfGuesses = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;


        while (win == false) {
            System.out.println("Guess a number between 1 and 500: ");
            guess = input.nextInt();
            numOfGuesses++;

            if (guess == guessNumber) {
                win = true;
            } else if (guess < guessNumber) {
                System.out.println("Your guess is too low \n");
            } else if (guess > guessNumber) {
                System.out.println("Your guess is too high \n");
            }
        }
        System.out.println("You guessed correctly!");
        System.out.println("The number was " + guessNumber);
        System.out.println("It took you " + numOfGuesses + " guesses!");
    }
}

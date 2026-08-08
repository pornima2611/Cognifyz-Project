package com.cognifyz;


import java.util.Random;
import java.util.Scanner;

public class Task1Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10) + 1;

        System.out.println("Guess a number between 1 and 10");

        System.out.print("Enter your guess: ");
        int guess = sc.nextInt();

        if (guess == secretNumber) {
            System.out.println("Congratulations! You guessed correctly.");
        } else {
            System.out.println("Wrong Guess!");
            System.out.println("Correct Number was: " + secretNumber);
        }

        sc.close();

	}

}

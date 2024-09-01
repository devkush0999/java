package programmingChallenge;

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("Welcome to the number guessing game");
        do{
            System.out.println("Guess a number between 1 and 10");
            guess = input.nextInt();
        } while(num != guess);
        System.out.println("You have sucessfully gussed the number");

        }  
     }
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int numAttempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game !");
        System.out.println("I am thinking of a number between 1 and 100. Can you guess it ?");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numAttempts++;

            if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numAttempts + " attempts.");
}
}

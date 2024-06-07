package numberGame;

import java.util.Scanner;

public class NumberGuessingGame {
	 public static void main(String[] args) {
	       	Scanner sc = new Scanner(System.in);
	        int minNumber = 1;
	        int maxNumber = 100;
	        int attemptsPerRound = 5;
	        boolean playAgain = true;

	        while (playAgain) {
	            // Generate random number
	            int randomNumber = (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;

	            int score = 0;
	            int currentRound = 1;

	            System.out.println("Welcome to the Number Guessing Game!");
	            System.out.println("Guess a number between " + minNumber + " and " + maxNumber + ".");

	            while (true) {
	                System.out.println("Round: " + currentRound + ", Attempt: " + (score + 1));
	                System.out.print("Enter your guess: ");
	                int guess = sc.nextInt();

	                if (guess == randomNumber) {
	                    System.out.println("Congratulations! You guessed the number in " + (score + 1) + " attempts.");
	                    break;
	                } else if (guess < randomNumber) {
	                    System.out.println("Your guess is too low. Try again!");
	                } else {
	                    System.out.println("Your guess is too high. Try again!");
	                }
	                score++;

	                if (score == attemptsPerRound) {
	                    System.out.println("You ran out of attempts. The number was: " + randomNumber);
	                    break;
	                }
	            }

	            System.out.println("Do you want to play again? (y/n)");
	            char choice = sc.next().charAt(0);
	            playAgain = choice == 'y' || choice == 'Y';
	        }

	        System.out.println("Thanks for playing!");
	        sc.close();
	    }
}

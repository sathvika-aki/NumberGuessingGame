import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int numberOfGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        
        while (true) {
            int guess = scanner.nextInt();
            numberOfGuesses++;
            
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations, you guessed the number in " + numberOfGuesses + " guesses!");
                break;
            }
        }
        
        scanner.close();
    }
}

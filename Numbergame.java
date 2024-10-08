
import java.util.Random;
import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean again = true;
        int score = 0;
        while (again) {
            int numberToGuess = random.nextInt(100) + 1;  // Generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int uGuess = scanner.nextInt();
                attempts++;

                if (uGuess == numberToGuess) {
                    guessedCorrectly = true;
                    System.out.println("Congrats! You've guessed the number correctly in " + attempts + " attempts.");
                    score += (maxAttempts - attempts + 1);  // Higher score for fewer attempts
                } else if (uGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Oops! You've used all your attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("yes")) {
                again = false;
                System.out.println("Thank you for playing! Your final score is " + score + ".");
            }
        }

        scanner.close();
    }
}


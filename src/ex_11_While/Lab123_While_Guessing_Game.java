package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {


        Random random = new Random();
        int numberTOGuess = random.nextInt(101);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be guessed: ");
        int guess;
        int attempts = 0;

        while (true) {
            if (!scan.hasNextInt()) {
                System.out.println("Invalid input. Please try again.");
                scan.next();
                continue;
            }
            guess = scan.nextInt();
            attempts++;
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter number between 1 and 100.");
                continue;

            } else  {
                System.out.println("Congratulations, you guessed it!");
                break;
            }
        }
    }
}

package org.sen;
import java.util.Scanner;

public class NoInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        // No input validation, directly using user input
        int number = Integer.parseInt(userInput);
        
        // Perform some action with the user input (unsafe)
        System.out.println("You entered: " + number);
    }
}

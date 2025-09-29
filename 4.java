// Student's name: SAMUEL BERNAL
// Group: 10B
// Date: 29/09/25
// Topic: JAVA SCRIPT BASICS 

import java.util.Scanner;

/**
 * This program asks the user to type two numbers
 * and then shows the result of adding them.
 */
public class SumOfTwoNumbers {

    public static void main(String[] args) {

        // 1. Scanner helps us read what the user types.
        Scanner scanner = new Scanner(System.in);

        // 2. Ask for the first number.
        System.out.println("Please enter the first number:");
        double number1 = scanner.nextDouble();

        // 3. Ask for the second number.
        System.out.println("Please enter the second number:");
        double number2 = scanner.nextDouble();

        // 4. Add the two numbers.
        double sum = number1 + number2;

        // 5. Show the result.
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // 6. Close the scanner (bye bye).
        scanner.close();
    }
}

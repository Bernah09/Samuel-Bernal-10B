// Student: Samuel Bernal
// Class: 10B
// Date: 29/09/25
// Exercise 3.1 - Sum of Three Numbers

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {

        // Create a scanner to read what the user types
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        // Ask for the second number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Ask for the third number
        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Add all three numbers
        double sum = num1 + num2 + num3;

        // Show the result
        System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}


// Student: Samuel Bernal
// Class: 10B
// Date: 29/09/25
// Exercise 3.2 - Product of Two Numbers

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {

        // Create a scanner to read what the user types
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        // Ask for the second number
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Multiply the two numbers
        double product = num1 * num2;

        // Show the result
        System.out.println("The product of " + num1 + " x " + num2 + " is: " + product);

        // Close the scanner
        scanner.close();
    }
}


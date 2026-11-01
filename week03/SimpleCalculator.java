/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 1: Simple Calculator
 *
 * Student:   Mary Joy Gazu
 * Matric No: 25/17852
 *
 * Asks the user for two numbers, then shows their sum, difference,
 * product and quotient. A number cannot be divided by zero, so the
 * quotient is only calculated when the second number is not zero.
 */

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: read both numbers as double so decimals are allowed
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Processing: these three work for any pair of numbers
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Output: %.2f shows each result to two decimal places
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Check the divisor first, then divide only if it is safe
        if (num2 == 0) {
            System.out.println("Division is undefined for a zero divisor.");
        } else {
            double quotient = num1 / num2;
            System.out.printf("Quotient: %.2f%n", quotient);
        }

        input.close();
    }
}

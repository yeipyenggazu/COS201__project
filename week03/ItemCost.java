/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Total Cost of Items
 *
 * Student:   Mary Joy Gazu
 * Matric No: 25/17852
 *
 * Asks for the name of an item, the quantity bought and the price of
 * one item, then works out:
 *
 *     total cost = quantity * unit price
 *
 * The quantity has to be 1 or more and the unit price cannot be negative.
 */

import java.util.Scanner;

public class ItemCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: the item name is text, the quantity is a whole number
        // and the unit price can have a decimal part
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // Validation: stop here if either value makes no sense
        if (quantity < 1 || unitPrice < 0) {
            System.out.println();
            System.out.println("Invalid input. Quantity must be at least 1 "
                    + "and unit price cannot be negative.");
        } else {
            // Processing: an int multiplied by a double gives a double
            double totalCost = quantity * unitPrice;

            // Output: a short summary of the purchase
            System.out.println();
            System.out.println("--- PURCHASE SUMMARY ---");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Unit price: %.2f%n", unitPrice);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }

        input.close();
    }
}

/*
    Jonathan Manzano
    
    Assignment: Selection Structures - Preliminary Part 1: Cost of Shipping

    This program is to calculate the price for a package depending on the 
    weight the user inputs.  The user is limited to input values greater 
    than 0 and less than or equal to 20.  Error messages re displayed when 
    the user's input is outside the accepted range.
*/

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        // Declare scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double weight, price;

        // Prompt user to input weight
        System.out.print("Enter weight of package in pounds: ");
        weight = input.nextDouble();

        // if else statment created to output the correct responds
        // depending on the users input
        if (weight < 0) {
            System.out.println("Invalid Input");
        }
        else if (weight > 0 && weight <= 1) {
            price = 3.5;
            System.out.printf("Cost: $%.2f%n", price);
        }
        else if (weight > 1 && weight <= 3) {
            price = 5.5;
            System.out.printf("Cost: $%.2f%n", price);
        }
        else if (weight > 3 && weight <= 10) {
            price = 8.5;
            System.out.printf("Cost: $%.2f%n", price);
        }
        else if (weight > 10 && weight <= 20) {
            price = 10.5;
            System.out.printf("Cost: $%.2f%n", price);
        }
        else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
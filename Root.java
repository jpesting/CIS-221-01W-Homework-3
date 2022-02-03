/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

import java.util.Scanner; // Used for user input for integer guess

public class Root { // Root Class - used to print results to the console

    public static void main(String[] args) { // Main method
        Scanner in = new Scanner(System.in); // Reference scanner class and assign it to 'in'
        Main result = new Main();   // Create object of Main class - Used to call the constructor
        System.out.println("Two dice will roll and you will guess the total:");
        System.out.println("Enter an integer (2 - 12): ");
        result.setValue(in.nextInt()); // Call setter to interpret user's input
        System.out.println("Sum of the two dice rolls: " + result.getSum()); // Print the sum to console
    }

}
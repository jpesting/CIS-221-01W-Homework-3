/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

public class Main { // Main Class - Used to declare variables

    // Class Attributes
    private int die1;
    private int die2;
    private int sum;

    public Main() { // Class Constructor
        die1 = Roll.roll(); // Call "roll" method from Roll Class
        die2 = Roll.roll(); // "roll" method used to generate an integer
                            // 1-6 to simulate the die roll - set both
                            // variables equal to their own unique rolls
        sum = die1 + die2;  // Manipulate the data by adding both rolls together
    }

    // Getter
    public int getSum() {
        return sum;
    }

    // Setter
    // We won't need this.sum = ... because the user will include their input in place of "x"
    public void setValue(int x) { // 
        if (sum == x) {
            System.out.println("You guessed correctly!");
        }
        else if ((x <= 1) || (x >= 13)) {
            System.out.println("Invalid input!");
        }
        else {
            System.out.println("You guessed incorrectly!");
        }
    }
    
}
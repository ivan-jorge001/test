/*
    This is the InchesToFeetInteractive Class
    where user input a number of inches to
    calculate the number of feet and inches.

    @author Ivan Jorge
    @version 1.0

    COP2800 MIDTERM-2B #: InchesToFeetInteractive
    File Name: InchesToFeetInteractive.java
 */

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double FEET_IN_ONE_INCH = 0.0833333;

        System.out.print("Enter a number of inches: ");
        int inches = scanner.nextInt();
        double numberOfFeetAndInches = inches * FEET_IN_ONE_INCH;
        int numberOfFeet = (int) (numberOfFeetAndInches);
        double numberOfInches = (numberOfFeetAndInches - numberOfFeet) * 10;

        System.out.println("\nThe number of inches are: " + inches);
        System.out.printf(inches + " inches becomes " + numberOfFeet + " feet and %.0f inches", numberOfInches);
    }
}

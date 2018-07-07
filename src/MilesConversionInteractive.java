/*
    This is the MilesConversionInteractive Class
    where user inputs a value to a double to calculate
    the number of kilometers and miles.

    @author Ivan Jorge
    @version 1.0

    COP2800 MIDTERM-2B #: MilesConversionInteractive
    File Name: MilesConversionInteractive.java
 */

import java.util.Scanner;

public class MilesConversionInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double NUMBER_OF_KM = 1.852;
        final double NUMBER_OF_MILES = 1.150779;
        // as we talked about in class why cant we put the constants about the file

        System.out.print("Enter Number of Neutical Miles: ");
        double neuticalMiles = scanner.nextDouble();
        double numberOfKm = neuticalMiles * NUMBER_OF_KM;
        double numberOfMiles = neuticalMiles * NUMBER_OF_MILES;

        System.out.println("\nThe Neutical Miles are: " + neuticalMiles);
        System.out.printf("The number of neutical miles in kilometer is %.3f", numberOfKm);
        System.out.printf("\nThe number of neutical miles in miless is %.3f", numberOfMiles);
    }
}

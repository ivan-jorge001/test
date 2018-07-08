/*
    This is the MilesConversion Class
    where I am setting a hardcoded
    value to an int with Nautical Miles
    and calculating the number of kilometers
    and miles.

    @author Ivan Jorge
    @version 1.0

    COP2800 MIDTERM-2B #: MilesConversion
    File Name: MilesConversion.java
 */

public class MilesConversion {
    public static void main(String[] args) {
        final double NUMBER_OF_KM = 1.852;
        final double NUMBER_OF_MILES = 1.150779;

        int neuticalMiles = 300;
        double numberOfKm = neuticalMiles * NUMBER_OF_KM;
        double numberOfMiles = neuticalMiles * NUMBER_OF_MILES;

        System.out.println("The Neutical Miles are: " + neuticalMiles);
        System.out.printf("The number sdasdasdasdasdasof neutical miles in kilometer is %.3f", numberOfKm);
        System.out.printf("\nThe number of neutical miles in miless is %.3f", numberOfMiles);
    }
}

/*
    This is the InchesToFeet Class
    where I am setting a hardcoded
    value to an int with inches and
    calculating the number of feet
    and inches.

    @author Ivan Jorge
    @version 1.0

    COP2800 MIDTERM-2B #: InchesToFeet
    File Name: InchesToFeet.java
 */

public class InchesToFeet {
    public static void main(String[] args) {
        final double FEET_IN_ONE_INCH = 0.0833333;

        int inches = 30;
        double numberOfFeetAndInches = inches * FEET_IN_ONE_INCH;
        int numberOfFeet = (int) (numberOfFeetAndInches);
        double numberOfInches = (numberOfFeetAndInches - numberOfFeet) * 10;

        System.out.println("The number of inches are: " + inches);
        System.out.printf(inches + " inches becomes " + numberOfFeet + " feet and %.0f inches", numberOfInches);
    }
}

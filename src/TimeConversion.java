/*
    This is the TimeConversion Class where user
    enters a number of minutes to be converted
    into days and hours.

    @author Ivan Jorge
    @version 1.0

    COP2800 MIDTERM-2B #: TimeConversion
    File Name: TimeConversion.java
 */

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        final int NUMBER_OF_MIN_IN_HOUR = 60;
        final int NUMBER_OF_MIN_IN_DAY = 1440;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of minutes: ");
        double minutes = scanner.nextDouble();
        int numberOfHours = (int) (minutes / NUMBER_OF_MIN_IN_HOUR);
        double numberOfDays = (double) (minutes / NUMBER_OF_MIN_IN_DAY);

        System.out.println("number of hours is: " + numberOfHours);
        System.out.printf("number of days is:  %.3f", numberOfDays);
    }
}
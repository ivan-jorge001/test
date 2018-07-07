/*
    This is a documentation template for a class.
    It will be used starting with Workshop 2A -
    This is the PayStub Class where I am printing to
    console, getting input form the user
    Use the necessary Print format to display a monthly pay stub with the following:

    First Name, Last Name
    Address
    Total number of dependents (Tax bracket)
    Amount Hours worked per week for 4 weeks
    Amount pay per week for 4 weeks
    Amount taxes per week for 4 weeks
    Monthly total pay
    Monthly total taxes

    @author Ivan Jorge
    @version 1.0

    COP2800 Workshop #: 3A - PayStub
    File Name: PayStub.java
 */

import java.util.Scanner;

public class PayStub {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = PayStub.getStringInput("Whats your first name", scanner);
        String lastName = PayStub.getStringInput("Whats your last name", scanner);
        String address = PayStub.getStringInput("Whats your address", scanner);
        String tel = PayStub.getStringInput("Whats your Telephone", scanner);
        double dependents = PayStub.getNumericInput("Total number of dependents", scanner);
        double hourlyRate = PayStub.getNumericInput("Hourly pay rate", scanner);
        double taxBracket;
        int numberOfWeeks = 4;
        double[] weeks = new double[4];
        double totalHoursWorked = 0;

        for (int x = 0; x < numberOfWeeks; x++) {
            double week = PayStub.getNumericInput("How many hours worked in week " + (x + 1), scanner);
            totalHoursWorked += week;
            weeks[x] = week;
        }

        double totalSalaryOfAllWeeks = totalHoursWorked * hourlyRate;

        if (dependents <= 2) {
            taxBracket = 21.33;
        } else if (dependents > 2 && dependents < 5) {
            taxBracket = 17.34;
        } else {
            taxBracket = 8.25;
        }

        System.out.printf("\n");
        System.out.println(firstName + ", " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Telephone: " + tel);
        System.out.println("Total number of dependents (" + dependents + "): " + taxBracket);

        System.out.println("\nAmount Hours worked per week for 4 weeks");
        PayStub.displayWorkedHoursInWeeks(weeks);

        System.out.println("\nAmount pay per week for 4 weeks");
        PayStub.displayPayOrTaxPerWeek(weeks, hourlyRate, taxBracket, "pay");

        System.out.println("\nAmount taxes per week for 4 weeks");
        PayStub.displayPayOrTaxPerWeek(weeks, hourlyRate, taxBracket, "tax");

        System.out.println("\nMonthly total pay");
        System.out.println("Monthly: " + PayStub.getAmountPayed(totalSalaryOfAllWeeks, taxBracket));

        System.out.println("\nMonthly total taxes");
        System.out.println("Monthly: " + PayStub.getAmountTaxed(totalSalaryOfAllWeeks, taxBracket));
    }

    private static String getStringInput(String header, Scanner scanner){
        System.out.printf(header + ": ");
        return scanner.nextLine();
    }

    private static double getNumericInput(String header, Scanner scanner){
        System.out.printf(header + ": ");
        return scanner.nextDouble();
    }

    private static  double getAmountTaxed(double totalSalary, double tax) {
        return totalSalary * (tax / 100);
    }

    private static double getAmountPayed(double totalSalary, double tax) {
        return totalSalary - getAmountTaxed(totalSalary, tax);
    }

    private static void displayWorkedHoursInWeeks(double[] weeks) {
        for (int x = 0; x < weeks.length; x++) {
            System.out.println("week " + (x + 1) + ": " + weeks[x]);
        }
    }

    private static void displayPayOrTaxPerWeek(double[] weeks, double hourlyRate, double taxBracket, String type) {
        for (int x = 0; x < weeks.length; x++) {
            double totalSalary = weeks[x] * hourlyRate;
            double amountPayed = 0;

            if (type == "tax"){
                amountPayed = PayStub.getAmountTaxed(totalSalary, taxBracket);
            }
            if (type == "pay") {
                amountPayed = PayStub.getAmountPayed(totalSalary, taxBracket);
            }
            System.out.println("week " + (x + 1) + ": " + amountPayed);
        }
    }
}

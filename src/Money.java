/*
    This is the Money Class where user
    enters an amount of money to be sorted
    into different bill of 20, 10, 5, 1.

    @author Ivan Jorge
    @version 1.0

    COP2800 MIDTERM-2B #: Money
    File Name: Money.java
 */

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        final int TWENTY = 20;
        final int TEN = 10;
        final int FIVE = 5;
        final int ONE = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dollars: ");

        int money = scanner.nextInt();

        int numberOfTwentyInMoney = Money.getNumberOfBills(money, TWENTY);
        int valueOfAllTwenty = numberOfTwentyInMoney * TWENTY;
        money -= valueOfAllTwenty;

        int numberOfTenInMoney = Money.getNumberOfBills(money, TEN);
        int valueOfAllTen = numberOfTenInMoney * TEN;
        money -= valueOfAllTen;

        int numberOfFiveInMoney = Money.getNumberOfBills(money, FIVE);
        int valueOfAllFive = numberOfFiveInMoney * FIVE;
        money -= valueOfAllFive;

       // assume the rest is all one dollar bill

        System.out.println("20s: " + numberOfTwentyInMoney + " dollar bills");
        System.out.println("10s: " + numberOfTenInMoney + " dollar bills");
        System.out.println("5s: " + numberOfFiveInMoney + " dollar bills");
        System.out.println("1s: " + money + " dollar bills");
    }

    public static int getNumberOfBills(int amount, int billSize) {
        return amount / billSize;
    }

}

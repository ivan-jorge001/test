/*
    This is the HellosJavaStudent
    Class where I am printing to
    console and retrieving the users
    name


    @author Ivan Jorge
    @version 1.0

    COP2800 MIDTERM-2B #: HellosJavaStudent
    File Name: HellosJavaStudent.java
 */

import java.util.Scanner;

public class HelloJavaStudent {
    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("\nHello World!\n");
        System.out.println("My name is "+ name +", I am a Java student, learning to code in the month of (use a variable to store the month).");
    }
}

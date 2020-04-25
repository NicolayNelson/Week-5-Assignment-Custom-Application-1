package edu.whccd.nnelson;
import java.util.Scanner;

/* is supposed to show how to use code methods and how to call them.
Author Nicolay Nelson
 */




public class Main {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int lowerBound = 100;
        int upperBound = 1000;
        boolean isValidIntegerInput = false;
        boolean isValidDoubleInput = false;
        do {
            displayString("Enter an integer (100-1000)");
            int userInput = input.nextInt();
            isValidIntegerInput = isValid(userInput, lowerBound, upperBound);
        } while (!isValidIntegerInput);


        do {
            displayString("Enter a double (100-1000)");
            double userInput = input.nextDouble();
            isValidDoubleInput = isValid(userInput, lowerBound, upperBound);
        } while (!isValidDoubleInput);
    }


    public static void displayString(String input) {
        System.out.println(input);
    }
    public static boolean isValid (int input, int lowerBound, int UpperBound) {
        displayString("This method validates if an integer input is within acceptable range");
        boolean output = false;
        if (input >= lowerBound && input <= UpperBound) {
            output = true;
            System.out.println(input + " is within range");
        } else {
            System.out.println(input + " is NOT within range");
        }
        return output;
    }
    public static boolean isValid (double input, double lowerBound, double UpperBound) {
        displayString("This method validates if a double input is within acceptable range");
        boolean output = false;
        if (input >= lowerBound && input <= UpperBound) {
            output = true;
            System.out.println(input + " is within range");
        } else {
            System.out.println(input + " is NOT within range");
        }
        return output;
    }
}
package com.java.prac;

public class ReverseNumber {
    public static void main(String args[]) {
        int number = 1534236469;
        int reversenumber = 0;

        while (number != 0) {
            // Get the last digit of the current number
            int digit = number % 10;

            // Check for overflow before updating reversenumber
            if (reversenumber > Integer.MAX_VALUE / 10) {
                System.out.println("Overflow occurred! The reversed number is out of bounds.");
                return; // Stop further processing
            }

            // Check for underflow before updating reversenumber
            if (reversenumber < Integer.MIN_VALUE / 10 ||
                    (reversenumber == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10)) {
                System.out.println("Underflow occurred! The reversed number is out of bounds.");
                return; // Stop further processing
            }

            // Update reversenumber with the last digit
            reversenumber = reversenumber * 10 + digit;

            // Remove the last digit from number
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversenumber);
    }
}

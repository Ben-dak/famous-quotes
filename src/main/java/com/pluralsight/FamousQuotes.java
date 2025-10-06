package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] favQuotes = {"No idea." , "Huh, what the?" , "My head hurts."};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 3: ");

        try {
            int input = Integer.parseInt(myScanner.nextLine());
            input--;
            System.out.println(favQuotes[input]);
        } catch (Exception e) {
            System.out.println("Number entered is not between 1 and 3.");
        }

    }
}

package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] favQuotes = {"no idea" , "huh, what the" , "my head hurts"};

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 3: ");
        String input = myScanner.nextLine();
        int i = Integer.parseInt(input);
        i--;
        System.out.println(favQuotes[i]);

    }
}

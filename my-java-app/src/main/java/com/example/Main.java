package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // Personalised greeting
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to Maven!");

        // Loop until user types "exit"
        while (true) {
            System.out.print("Type something (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye, " + name + "!");
                break;
            }

            System.out.println("You typed: " + input);
        }

        scanner.close();
    }
}

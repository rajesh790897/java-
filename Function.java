package Linkedin; // Choose a meaningful package name

import java.util.Scanner;

public class Function {

    public static void developerTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type yes to start developer tea time:");

        Scanner a = new Scanner(System.in);
        String response = a.next();

        if (response.equalsIgnoreCase("yes")) {            
            System.out.println("How long would you like your tea break to be (in minutes)?");

            while (!a.hasNextInt()) {
                System.out.println("Please enter a valid number (in minutes):");
                a.next();
                        
            }

            int minutes = a.nextInt();
            System.out.println("It's Developer tea time for " + minutes + " minutes!");
        } else {
            System.out.println("No tea time today. Back to work!"); 
        }
    }

    public static void main(String[] args) {
        developerTeaTime();
    }
}

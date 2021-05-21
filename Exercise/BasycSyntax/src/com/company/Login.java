package com.company;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        for (int i = (int) username.length()-1; i >= 0; i--) {
            password += username.charAt(i);
        }
        int counter = 1;
        String currentCommand = scanner.nextLine();
         while (!currentCommand.equals(password) && counter < 4){
             System.out.println("Incorrect password. Try again.");
             currentCommand = scanner.nextLine();
             counter++;
         }
         if (currentCommand.equals(password)){
             System.out.printf("User %s logged in.", username);
         }
         else {
             System.out.printf("User %s blocked!", username);
         }
    }
}

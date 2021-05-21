package com.company;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String decodedString = "";

        for (int i = 0; i < n; i++) {
            String charAsString = scanner.nextLine();
            char currentChar = charAsString.charAt(0);
            int decodedChar = currentChar + key;
            decodedString += (char)decodedChar;
        }
        System.out.println(decodedString);
    }
}

package com.company;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int sumOfDigits = 0;
        for (int i = 0; i < number.length(); i++) {
            int currentDigit = number.charAt(i) - 48;
            int currentFactorial = 1;
            for (int j = 1; j <= currentDigit; j++) {
                currentFactorial *= j;
            }
            sumOfDigits +=currentFactorial;
        }
        int strongNumber = Integer.parseInt(number);
        if (strongNumber == sumOfDigits){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

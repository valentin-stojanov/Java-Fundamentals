package com.company;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int dividetBy = -1;

        if (number % 2 == 0) {
            dividetBy = 2;
        }
        if (number % 3 == 0) {
            dividetBy = 3;
        }
        if (number % 6 == 0) {
            dividetBy = 6;
        }
        if (number % 7 == 0) {
            dividetBy = 7;
        }
        if (number % 10 == 0) {
            dividetBy = 10;
        }
        if (dividetBy == -1) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d", dividetBy);
        }
    }
}

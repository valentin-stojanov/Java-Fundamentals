package com.company;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentCommand = scanner.nextLine();
        double availableMoney = 0;

        while (!currentCommand.equals("Start")) {
            double currentCoins = Double.parseDouble(currentCommand);
            if (currentCoins == 0.1 || currentCoins == 0.2 || currentCoins == 0.5 || currentCoins == 1 || currentCoins == 2) {
                availableMoney += currentCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }
            currentCommand = scanner.nextLine();
        }
        String product = scanner.nextLine();


        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (availableMoney < 2.0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 2.0;
                        System.out.println("Purchased Nuts");
                    }
                    break;
                case "Water":
                    if (availableMoney < 0.7) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 0.7;
                        System.out.println("Purchased Water");
                    }
                    break;
                case "Crisps":
                    if (availableMoney < 1.5) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                    break;
                case "Soda":
                    if (availableMoney < 0.8) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        availableMoney -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                    break;
                case "Coke":
                    if (availableMoney < 1.0) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        System.out.println("Purchased Coke");
                        availableMoney -= 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            if (availableMoney <= 0){
                break;
            }
            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", availableMoney);

    }
}

package com.company;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;

        switch (groupType){
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        if (peopleNumber >= 30) {
                            totalPrice = (1 - 0.15) * (8.45 * peopleNumber);
                        } else {
                            totalPrice = (8.45 * peopleNumber);
                        }
                        break;
                    case "Saturday":
                        if (peopleNumber >= 30) {
                            totalPrice = (1 - 0.15) * (9.80 * peopleNumber);
                        } else {
                            totalPrice = (9.80 * peopleNumber);
                        }
                        break;
                    case "Sunday":
                        if (peopleNumber >= 30) {
                            totalPrice = (1 - 0.15) * (10.46 * peopleNumber);
                        } else {
                            totalPrice = (10.46 * peopleNumber);
                        }
                        break;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        if (peopleNumber >= 100) {
                            totalPrice = (((peopleNumber - 10) * 10.90) );
                        } else {
                            totalPrice = ((peopleNumber) * 10.90);
                        }
                        break;
                    case "Saturday":
                        if (peopleNumber >= 100) {
                            totalPrice = (((peopleNumber - 10) * 15.60));
                        } else {
                            totalPrice = ((peopleNumber ) * 15.60);
                        }
                        break;
                    case "Sunday":
                        if (peopleNumber >= 100) {
                            totalPrice = (((double) (peopleNumber - 10) * 16.0) );
                        } else {
                            totalPrice = ((double) (peopleNumber ) * 16.0);
                        }
                        break;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        if (10 <= peopleNumber && peopleNumber <= 20) {
                            totalPrice = (1 - 0.05) * (15.0 * peopleNumber);
                        } else {
                            totalPrice = (15.00 * peopleNumber);
                        }
                        break;
                    case "Saturday":
                        if (10 <= peopleNumber && peopleNumber <= 20) {
                            totalPrice = (1 - 0.05) * (20.00 * peopleNumber);
                        } else {
                            totalPrice = (20.00 * peopleNumber);
                        }
                        break;
                    case "Sunday":
                        if (10 <= peopleNumber && peopleNumber <= 20) {
                            totalPrice = (1 - 0.05) * (22.50 * peopleNumber);
                        } else {
                            totalPrice = (22.50 * peopleNumber);
                        }
                    break;
                }
                break;
        }
        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}

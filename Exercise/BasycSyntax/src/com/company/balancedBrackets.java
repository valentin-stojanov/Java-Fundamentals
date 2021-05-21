package com.company;

import java.util.Scanner;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isUnbalanced = false;
        int bracketCounter = 0;

        for (int i = 0; i < n; i++) {
            String currentString = scanner.nextLine();
            int leftOpenedBracket = 0;
            int rightOpenedBracket = 0;
            for (int j = 0; j < currentString.length(); j++) {
                char currentChar = currentString.charAt(j);

                if (currentChar == ')') {
                    bracketCounter -= 1;
                    rightOpenedBracket += 1;
                    if (i == 0){
                        isUnbalanced = true;
                        break;
                    }
                }
                if (rightOpenedBracket > 1 || bracketCounter == -1) {
                    isUnbalanced = true;
                    break;
                }
                if (currentChar == '(') {
                    bracketCounter += 1;
                    leftOpenedBracket += 1;
                }
                if (leftOpenedBracket > 1) {
                    isUnbalanced = true;
                    break;
                }
            }
            if (isUnbalanced) {

                break;
            }
        }
        if (bracketCounter == 0) {
            System.out.println("BALANCED");
        }
        if (isUnbalanced || bracketCounter !=0){
            System.out.println("UNBALANCED");
        }

    }
}

package com.company;

import java.util.Scanner;

public class BalancedBrackets1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int bracketCounter = 0;

        for (int i = 0; i < n; i++) {
            String currentString = scanner.nextLine();

            for (int j = 0; j < currentString.length(); j++) {
                char currentChar = currentString.charAt(j);
                if (currentChar == ')'){
                    bracketCounter -=1;
                    if (bracketCounter == -1){
                        break;
                    }
                }
                if (currentChar == '('){
                    bracketCounter +=1;
                }
                if (bracketCounter == 2){
                    break;
                }
            }

            if (bracketCounter == -1){
                break;
            }
            if (bracketCounter ==2){
                break;
            }

        }

        if (bracketCounter ==0 ){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }

    }
}

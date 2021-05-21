package com.company;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        0-2 – baby;
//        3-13 – child;
//        14-19 – teenager;
//        20-65 – adult;
//        >=66 – elder;
//        All the values are inclusive.

        int age= Integer.parseInt(scanner.nextLine());
        String person;

        if (0<=age && age <=2){
            person = "baby";
        } else if (3<=age && age <=13){
            person = "child";
        }else if (14<=age && age<=19){
            person = "teenager";
        }else if (20<= age && age <= 65){
            person =  "adult";
        }else if (age>=65){
            person = "elder";
        }else{
            person = "invalid age";
        }
        System.out.println(person);
    }
}

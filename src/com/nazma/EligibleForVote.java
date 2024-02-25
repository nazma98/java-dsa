package com.nazma;

import java.util.Scanner;

public class EligibleForVote {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age ");
        int age = scanner.nextInt();
        boolean canVote = checkEligibility(age);
        if(canVote) {
            System.out.println("Eligible!");
        } else {
            System.out.println("Sorry can't vote yet");
        }
    }

     static boolean checkEligibility(int age) {
        return (age >= 18);
    }
}

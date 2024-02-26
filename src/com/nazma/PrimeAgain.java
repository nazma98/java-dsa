package com.nazma;

import java.util.Scanner;

public class PrimeAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = scanner.nextInt();
        boolean isPrime = checkPrime(num);

        if(isPrime){
            System.out.println("Yes prime!");
        } else {
            System.out.println("No prime!");
        }
    }

    static boolean checkPrime(int num) {
        for (int i = (int) Math.sqrt(num); i> 1; i--) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

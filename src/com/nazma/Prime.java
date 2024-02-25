package com.nazma;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = scanner.nextInt();

        if(checkPrime(number)) {
            System.out.println("Is a prime!");
        } else  {
            System.out.println("Is not a prime!");
        }
    }

    static boolean checkPrime(int number){

        for(int i = (int) sqrt(number); i > 1; i--) {
            if ( number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

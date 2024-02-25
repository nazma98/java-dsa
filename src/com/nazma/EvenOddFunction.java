package com.nazma;

import java.util.Scanner;

public class EvenOddFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = scanner.nextInt();
        boolean isEven = checkOddEven(number);
        if (isEven) {
            System.out.println("The number " + number +" is even!");
        } else {
            System.out.println("The number "+ number + " is odd");
        }
    }

    static boolean checkOddEven(int number) {
        return (number % 2 == 0);
    }
}

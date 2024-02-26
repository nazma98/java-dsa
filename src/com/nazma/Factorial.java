package com.nazma;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = scanner.nextInt();
        int factNum = calculateFactorial(num);

        System.out.println(factNum);
    }

    static int calculateFactorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}

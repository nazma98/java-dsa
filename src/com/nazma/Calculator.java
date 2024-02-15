package com.nazma;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1 ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num 2 ");
        int num2 = scanner.nextInt();
        System.out.println("Enter operator ");
        char op = scanner.next().trim().charAt(0);

        double result = 0;

        if(op == '+') {
            result = num1 + num2;
        }
        if (op == '-') {
            result = num1 - num2;
        }
        if(op == '*') {
            result = num1 * num2;
        }
        if(op == '/') {
            if(num2 != 0) {
                result = num1 /num2;
            } else {
                System.out.println("Can't be divided by zero");
            }
        }

        System.out.println("Result " + result);

    }
}

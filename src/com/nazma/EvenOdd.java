package com.nazma;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        if(num1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }
}

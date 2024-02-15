package com.nazma;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max;
        if (num1 > num2) {
            max = num1;
        } else  {
            max = num2;
        }

        System.out.println("Largest "+ max);
    }
}

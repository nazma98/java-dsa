package com.nazma;

import java.util.Scanner;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number ");
        int num3 = scanner.nextInt();

        int largestNum = findLargest(num1, num2, num3);
        int smallestNum = findSmallest(num1, num2, num3);
        System.out.println("Largest num "+ largestNum +" and smallest number " + smallestNum);
    }

    static int findLargest(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > num1 && num2 > num3) {
            max= num2;
        } else if(num3 > num1 && num3 > num2) {
            max = num3;
        }
        return  max;
    }

    static int findSmallest(int num1, int num2, int num3) {
        int min = num1;
        if(num2 < num1 && num2 < num3) {
            min = num2;
        } else if(num3 < num1 && num3 < num2) {
            min = num3;
        }
        return min;
    }
}

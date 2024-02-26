package com.nazma;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter the 1st number ");
        num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number ");
        num2 = scanner.nextInt();
        System.out.print("Enter the 3rd number ");
        num3 = scanner.nextInt();

        boolean isPythagorean = checkPythagorean(num1, num2, num3);

        if (isPythagorean){
            System.out.println("Yes ");
        } else {
            System.out.println("No");
        }

    }

    static  boolean checkPythagorean(int num1, int num2, int num3){
        if(num1*num1 + num2*num2 == num3 * num3) return true;
        if (num1*num1 + num3*num3 == num2*num2) return true;
        if(num2*num2 + num3*num3 == num1*num1) return true;
        return false;
    }
}

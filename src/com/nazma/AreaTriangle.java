package com.nazma;
import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of triangle:");
        int base = scanner.nextInt();
        System.out.print("Enter the height of the triangle");
        int height = scanner.nextInt();
        double areaTriangle = calculateAreaTrinagle(base, height);
        System.out.println("The area of triangle is "+areaTriangle);
    }

     static double calculateAreaTrinagle(int base, int height) {
        return (0.5) * base * height;
    }
}

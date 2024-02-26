package com.nazma;

import java.util.Scanner;

public class CircleAreaCircumf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double circumCircle = calculateCircumCircle(radius);
        double areaCircle = calculateAreaCircle(radius);

        System.out.println("The circumference of circle "+ circumCircle);
        System.out.println("The area of circle "+areaCircle);
    }

    static  double calculateCircumCircle(int radius) {
        return 2 * Math.PI *  radius;
    }

    static double calculateAreaCircle(int radius) {
        return Math.PI*radius * radius;
    }
}

package com.nazma;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double areaofCircle = calculateAreaOfCircle(radius);
        System.out.println("The area of circle with radius "+ radius +" is :"+ areaofCircle);
    }

    static double calculateAreaOfCircle(int radius) {
        return  3.1416 * radius * radius;

    }

}

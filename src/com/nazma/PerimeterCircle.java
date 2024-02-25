package com.nazma;
import java.util.Scanner;
public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        double perimCircle = calculatePerimCircle(radius);
        System.out.println("The perimeter of circle is :"+perimCircle);
    }

    static double calculatePerimCircle(int radius){
        return 2 * 3.1416 * radius;
    }
}

package com.nazma;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class AreaEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the equilateral triangle: ");
        int side = scanner.nextInt();
        double area = calculateEquilateralTri(side);
        System.out.println("The area is: "+ area);
    }

    static double calculateEquilateralTri(int side) {
        return ( sqrt(3) * side * side ) / 4.0;
    }
}

package com.nazma;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the common side ");
        int side1 = scanner.nextInt();
        System.out.println("Enter the unique side ");
        int side2 = scanner.nextInt();

        double areaIsoscelesTri = calculateIsoTriArea(side1, side2);
        System.out.print("The area of isosceles triangle: "+areaIsoscelesTri);

    }

    static double calculateIsoTriArea(int side1, int side2){
        return 0.5 * side2 * sqrt(side1*side1 - (side2*side2 / 4.0));
    }
}

package com.nazma;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class AreaRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = scanner.nextInt();
        System.out.print("Enter the diagonal: ");
        int diagonal = scanner.nextInt();
        double area = calculateRhombusArea(side, diagonal);
        System.out.println("The area is: "+area);

    }

    static double calculateRhombusArea(int side, int diagonal) {
        return 0.5 * diagonal * sqrt(4 * side * side - diagonal *diagonal);
    }
}

package com.nazma;
import java.util.Scanner;
public class PerimEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the triangle");
        int side = scanner.nextInt();
        int perimTri = calculatePerimTri(side);
        System.out.println("The perimeter of trinagle is :"+ perimTri);
    }

     static int calculatePerimTri(int side) {
        return  3 * side;
    }
}

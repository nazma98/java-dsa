package com.nazma;
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one side of the rectangle:");
        int side1 = scanner.nextInt();
        System.out.print("enter the other side of the rectangle:");
        int side2 = scanner.nextInt();
        int areaRectangle = calculateAreaRect(side1, side2);
        System.out.println("Area of the rectangle: "+areaRectangle);
    }

    static int calculateAreaRect(int side1, int side2){
        return side1 * side2;
    }
}

package com.nazma;
import java.util.Scanner;
public class PerimParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the long parallel side ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the short parallel side ");
        int side2 = scanner.nextInt();
        int perimParallelogram = calculatePerimParallelogram(side1, side2);
        System.out.println("The perimeter is: "+ perimParallelogram);
    }
    static int calculatePerimParallelogram(int side1, int side2) {
        return 2 * ( side1 + side2 );
    }
}

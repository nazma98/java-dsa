package com.nazma;

import java.util.Scanner;

public class PerimSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the square ");
        int side = scanner.nextInt();
        int perimSquare = calculatePerimSq(side);
        System.out.println("The perimeter of the square is "+ perimSquare);
    }

    static int calculatePerimSq(int side) {
        return 4 * side;
    }
}

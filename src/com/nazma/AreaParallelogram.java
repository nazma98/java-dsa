package com.nazma;
import java.util.Scanner;
import static  java.lang.Math.sqrt;
public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        int base = scanner.nextInt();
        System.out.print("Enter the height of the parallelogram: ");
        int height = scanner.nextInt();

        int areaParallelogram = calculateArea(base, height);
        System.out.println("The area is : " +areaParallelogram);

    }

    static int calculateArea(int base, int height) {
        return base * height;
    }
}

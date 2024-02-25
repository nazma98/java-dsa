package com.nazma;
import java.util.Scanner;
public class VolumeCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the cone ");
        int height = scanner.nextInt();
        System.out.print("Enter the radius of the cone ");
        int radius = scanner.nextInt();
        double volumeCone = calculateVolumeCone(radius, height);
        System.out.println("The volume of the cone is " + volumeCone);
    }

    static  double calculateVolumeCone(int radius, int height) {
        return 3.1416 * radius * radius * height / 3.0;
    }
}

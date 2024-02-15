package com.nazma;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter principal ");
        int principal = scanner.nextInt();
        System.out.print("Enter time ");
        int time = scanner.nextInt();
        System.out.print("Enter rate ");
        double rate = scanner.nextFloat();
         double simpleInterest = principal * time * rate;

        System.out.println("Total " + simpleInterest);
    }
}

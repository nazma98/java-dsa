package com.nazma;
import java.util.Scanner;
public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rupee = scanner.nextFloat();
        double usd = rupee * 0.012;
        System.out.println(rupee +" rupee = "+usd+ " usd");
    }
}

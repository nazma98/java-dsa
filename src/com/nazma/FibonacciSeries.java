package com.nazma;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int cnt = 2;
        int temp;
        System.out.print(a+" "+ b+ " ");

        while(cnt <= n) {
            temp = b;
            b = b+a;
            a = temp;
            cnt++;
            System.out.print(b+" ");
        }
    }
}

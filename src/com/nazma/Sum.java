package com.nazma;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {

        sum();


        int sum = sum2();
        System.out.println("The sum of return function is " + sum);

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("enter second number ");
        int num2 = scanner.nextInt();

        int result = sum3(num1, num2);
        System.out.println("the sum of arg sum function "+ result);

    }

    static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("enter second number ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);
    }

    static int sum2() {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("enter num1");
        num1 = scanner.nextInt();
        System.out.print("enter num2");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        return sum;
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}

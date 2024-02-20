package com.nazma;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = scanner.next();
        custom_greeting(name);
    }

    static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello "+ name + ", Good morning!");
    }

    static void custom_greeting(String name){
        System.out.println("Ohayo " + name);
    }
}

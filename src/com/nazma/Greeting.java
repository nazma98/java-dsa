package com.nazma;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = scanner.next();
        String customGreet = custom_greeting(name);
        System.out.println(customGreet);
    }

    static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello "+ name + ", Good morning!");
    }

    static String custom_greeting(String name){
        return "Ohayo  " + name;
    }
}

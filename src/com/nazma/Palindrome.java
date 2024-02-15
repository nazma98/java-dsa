package com.nazma;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
         int length = name.length();
         int cnt = 0;
         int i;
         for(i = 0; i< length/2; i++) {
             if(name.charAt(i) == name.charAt(length-i-1)) {
                 cnt++;
             }
         }

         if(cnt == length/2) {
             System.out.println("Palindrome");
         } else {
             System.out.println("Not a palindrome");
         }
//        System.out.println(length);
    }
}

package com.nazma;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPalindrome = checkPalindrome(num);

        if (isPalindrome) {
            System.out.println("Yes palindrome!!");
        } else {
            System.out.println("No palindrome!");
        }
    }

    static boolean checkPalindrome(int num) {
        int reverse = 0; // calculate the reverse of the number; if both equals, palindrome!
        int temp = num;
        while(temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;

        }

        if (reverse == num) {
            return true;
        }

        return false;

    }
}

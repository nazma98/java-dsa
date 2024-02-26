package com.nazma;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println();

        for (int num : arr) {
            System.out.print(num+" ");
        }

        System.out.println(Arrays.toString(arr));

        // array of  objects

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }

            System.out.print(Arrays.toString(str));
    }
}

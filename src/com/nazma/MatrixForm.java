package com.nazma;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixForm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }

        // enhanced for loop in array
        for(int[] ar : arr) {
            for(int a: ar) {
                System.out.print(a +" ");
            }
//            System.out.println(Arrays.toString(ar));
            System.out.println();
        }
    }
}

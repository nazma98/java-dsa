package com.nazma;

import java.util.Arrays;

public class Max2DArray {
    public static void main(String[] args) {
        int[][] num = {{12, 412, 34},{4, 634,2 , 42}, {42, 98}, {45, 99, 89}};
        System.out.println(searchMax2D(num));
        System.out.println(Arrays.toString(searchMaxLoc(num)));
    }

    static int searchMax2D(int[][] num) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (max < num[i][j]) {
                    max = num[i][j];
                }
            }
        }
        return max;
    }

    static int[] searchMaxLoc(int[][] num) {
        int max = Integer.MIN_VALUE;
        int row = -1, col = -1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (max < num[i][j]) {
                    max = num[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }
}

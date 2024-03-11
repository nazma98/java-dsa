package com.nazma;

import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] num = {{1, 22, 34},
                        {43, 12, 8},
                        {412, 55}
                         };
        System.out.println(Arrays.toString(linearSearch2D(num, 22)));

    }

    static int[] linearSearch2D(int[][] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}

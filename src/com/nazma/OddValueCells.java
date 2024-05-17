package com.nazma;

import java.util.Arrays;

public class OddValueCells {
    public static void main(String[] args) {
        int[][] indices = {{0,1}, {1,1}};
        int oddvalue = oddCells(2, 3, indices);
        System.out.println(oddvalue);
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] iniMat = new int[m][n];
        for (int i = 0; i < iniMat.length; i++) {
            for (int j = 0; j < iniMat[i].length; j++) {
                iniMat[indices[i][0]][j]++;
                iniMat[i][indices[i][1]]++;
            }
        }

        int cnt = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (iniMat[i][j]%2 != 0) {
                    cnt++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(iniMat[i]));

        }

        return cnt;
    }
}

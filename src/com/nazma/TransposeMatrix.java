package com.nazma;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] mat = {{2,4,-1},{-10,5,11},{18,-7,6}};
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(transpose(mat)[i]));

        }
    }

    public static int[][] transpose(int[][] matrix) {
        int col = matrix[0].length;
       int[][] transmat = new int[col][matrix.length];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transmat[i][j] = matrix[j][i];
            }
        }
        return transmat;
     }
}

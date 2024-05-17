package com.nazma;

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
int[][] mat = {{0,0,0},{0,1, 0}, {1,1,1}};
int[][] target = {{1,1,1}, {0,1,0}, {0,0,0}};
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(transposeMat(mat)[i]));
        }
//        for (int i = 0; i < mat.length; i++) {
//            System.out.println(Arrays.toString(mat[i]));
//        }

        System.out.println(findRotation(mat, target));
        rotateMat90(mat);
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
//    static boolean findRotation(int[][] mat, int[][] target) {
//        int col = mat[0].length;
//        int[][] transMat = new int[col][mat.length];
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//
//                transMat[i][j] = mat[j][i];
//
//            }
//        }
//
//        for (int i = 0; i < transMat.length; i++) {
//            for (int j = transMat[i].length - 1, k=0; j >= 0 ; j--, k++) {
//                if (transMat[i][j] != target[i][k]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    static int[][] transposeMat(int[][] mat) {
        int col = mat[0].length;
        int[][] transMat = new int[col][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                    transMat[i][j] = mat[j][i];

            }
        }
        return transMat;
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = false;
        for(int k = 0; k < 4; k++){
            rotateMat90(mat);
            outerLoop: for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[0].length; j++){
                    if(mat[i][j] != target[i][j]){
                        flag = false;
                        break outerLoop;
                    } else{
                        flag = true;
                    }
                }

            }
            if(flag){
                return true;
            }

        }
        return false;
    }

     static void rotateMat90(int[][] mat){
        // transpose the mat
        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat[i].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // reverse the array in the mat
        for(int[] arr: mat){
            int start = 0;
            int end = arr.length - 1;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}

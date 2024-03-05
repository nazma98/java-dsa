package com.nazma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {

    public static void main(String[] args) {
//        int[][] matrix= {{3,7,8}, {9,11,13},{15, 16, 17}};
        int[][] matrix = {{1,10,4,2}, {9,3,8, 7}, {15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }

//    public static List<Integer> findluckyNumbers (int[][] matrix) {
//        List<Integer> list = new ArrayList<>();
////        for (int i = 0; i < ; i++) {
////
////        }
//    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int lucky ;
        for (int i = 0; i < matrix.length; i++) {
            lucky = minRowNum(matrix[i]);

            System.out.println(lucky);
            int k=0;
            for (int j = 0; j < matrix[i].length; j++, k++) {
                int cnt = 0;
                for (int l = 0; l < matrix.length; l++) {
//                    System.out.println("mat[l][j] "+matrix[l][j]);
                    if (lucky >= matrix[l][j]) {
                        cnt++;

//                    System.out.println(cnt);
                    }
                }

//                System.out.println(cnt);
                if (cnt == matrix.length) {
                    list.add(lucky);
                }
            }


        }

        return list;
    }

    static int minRowNum(int[] row) {
       int min = row[0];

//        int[] minIndex = new int[2];
        for (int i = 1; i < row.length; i++) {
            if (min > row[i]) {
                min = row[i];
            }
        }

        return min;
    }

}

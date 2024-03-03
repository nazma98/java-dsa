package com.nazma;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {
                            {1,1,0},
                            {1,0,1},
                            {0,0,0}
                        };

        // output = {
        //               {1, 0 , 0},
        //               {0, 1, 0 }
        //               {1, 1, 1 }
        // }

//        System.out.println(Arrays.toString(flipAndInvertImage(image)));
        for (int i = 0; i < image.length; i++) {

            System.out.println(Arrays.toString(flipAndInvertImage(image)[i]));
        }
    }


    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] rev = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int k = 0;
            for (int j = image[i].length - 1; j >= 0 ; j--, k++) {
                if (image[i][j] == 1) {
                    rev[i][k] = 0;
                } else {
                    rev[i][k] = 1;
                }

            }
        }

        return rev;
    }
}

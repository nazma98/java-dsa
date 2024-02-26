package com.nazma;

import java.util.Arrays;
import java.util.Scanner;

public class PassingArrayFunc {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int[] nums = {12, 15, 43, 143};
        System.out.println(Arrays.toString(nums));

        change(nums);

        System.out.println(Arrays.toString(nums));
        // output [12, 200, 43, 143]
        // Array is mutable
        //nums and arr both ref variable point to the same array object
    }

    static void change(int[] arr) {
        arr[2] = 200;
    }
}

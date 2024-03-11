package com.nazma;

public class MinLinearSearch {
    public static void main(String[] args) {
        int[] num = {1,23, -231, -213, 392, 394, 93, 92};
        System.out.println(findMin(num));
    }

    static int findMin(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];

            }
        }
        return min;
    }
}

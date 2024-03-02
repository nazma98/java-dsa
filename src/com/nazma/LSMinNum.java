package com.nazma;

public class LSMinNum {
    public static void main(String[] args) {
        int[] nums = {12, 43, 123, -34, 134};
        System.out.println(findMin(nums));
    }

    static int findMin(int[]nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }
        }

        return min;
    }
}

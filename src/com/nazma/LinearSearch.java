package com.nazma;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {2, 42, 41, 14, 45,98};
        int target = 141;
        System.out.println(search(nums, target));
    }

    static int search(int[]nums, int target) {
        if (nums.length == 0) {
            return  -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

package com.nazma;

public class LinearSearchRange {
    public static void main(String[] args) {
        int[] nums = {12, 312, 98, 42, 90, -32};
        int target = 42;
        System.out.println(searchInRange(nums, target, 1, 4));
    }

    // assume the array is not empty
    static int searchInRange(int[] nums, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

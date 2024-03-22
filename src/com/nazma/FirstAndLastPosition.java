package com.nazma;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
int [] nums = {5, 7, 7, 8, 8 , 10};
int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = bsearch(nums, target, true);
        ans[1] = bsearch(nums, target, false);


        return ans;
    }

    static int bsearch(int[] nums, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if(firstIndex) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }

        return ans;
    }
}

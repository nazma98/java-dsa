package com.nazma;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
        public static int[] smallerNumbersThanCurrent(int[] nums) {
            int len = nums.length;
            int[] ans = new int[len];
            int i, j;
            for(i=0;i<len; i++) {
                int cnt=0;
                for (j=0; j < len; j++) {
                    if(nums[i]>nums[j] && j!=i) {
                        cnt++;
                    }
                    ans[i] = cnt;
                }
            }

            return ans;
        }
}

package com.nazma;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));

    }

    public static int numIdenticalPairs(int[] nums) {
        int i, j;
        int cnt=0;
        int len = nums.length;
        for(i=0; i< len; i++) {
            for(j=1; j< len; j++) {
                if(nums[i] == nums[j] && i < j) {
                    cnt++;
                }

            }
        }

        return cnt;
    }
}

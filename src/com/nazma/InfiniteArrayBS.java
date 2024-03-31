package com.nazma;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int [] nums = {1, 12, 21, 23, 24, 25,26,28, 29, 30, 32, 37, 39, 41, 43, 48, 54, 75, 89, 99, 100, 123};
        int result = ans(nums, 26);
        System.out.println(result);

    }

    static int ans(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int newStart = end + 1;
            end += (end - start + 1 ) * 2;
            start = newStart;
        }

        return binarySearch(nums, target, start, end);
    }
    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else  {
                return mid;
            }
        }
        return  -1;
    }
}

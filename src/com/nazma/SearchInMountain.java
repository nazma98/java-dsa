package com.nazma;

public class SearchInMountain {
    public static void main(String[] args) {

        int []nums = {0,1,2,3,5,9, 6, 4,3,2,1};

        System.out.println(findInMountainArray(nums, 4));
    }

    public static int findInMountainArray(int []nums, int target) {
        int peak = peakIndexMountain(nums);
        int ascTry = orderAgnosticBS(nums, target, 0, peak);
        if(ascTry != -1) {
            return  ascTry;
        } else {
            int descTry = orderAgnosticBS(nums, target, peak + 1, nums.length-1);
            if (descTry != -1) {
                return descTry;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int []nums, int target, int start, int end) {
//        int start = 0;
//        int end = nums.length - 1;
        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if(nums[mid] > target ) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else  {
                if(nums[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }

    static int peakIndexMountain(int []nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end-start) / 2;
            if (nums[mid] > nums[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

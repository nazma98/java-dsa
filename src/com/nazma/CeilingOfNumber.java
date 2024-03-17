package com.nazma;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] num = {-12, -10, -3, 1, 3, 5, 9, 12, 32, 56};
        int target = 57;
        int ans = findCeiling(num, target);
        System.out.println(ans);

    }

    static int findCeiling(int[] num, int target) {
        int start = 0;
        int end = num.length-1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) /2 ;
            if (target < num[mid]) {
                end = mid -1;
            } else if(target > num[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

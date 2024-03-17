package com.nazma;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] num = {-12, -11, -9, 1, 12, 32, 53, 54, 89};
        int[] num = {89, 78, 56, 34, 23,12, 10, -21, -32};
        int target = -312;

        int ans = orderAgnosticBS(num, target);
        System.out.println(
                ans
        );
    }

    static int orderAgnosticBS(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        boolean isAsc = num[start] < num[end];

        while (start <= end) {
            int mid = start + (end - start) /2;
            if (num[mid] == target) {
                return mid;
            }
            if (isAsc){
                if (num[mid] > target) {
                    end = mid -1;
                } else  {
                    start = mid + 1;
                }
            } else {
                if (num[mid] > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}

package com.nazma;

public class BinarySearch {
    public static void main(String[] args) {
int[] num = {-21, -1, 0, 12, 21, 31,54, 75,98};
int target = 908;
        System.out.println(binarySearch(num, target));
    }

    public static int binarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length -1;
        while(start<= end) {
            int mid = start + ((end - start) / 2);

            if (num[mid] > target) {
                end = mid-1;
            } else if(num[mid] < target) {
                start = mid +1;
            } else  {
                return mid;
            }
        }

        return -1;

    }
}

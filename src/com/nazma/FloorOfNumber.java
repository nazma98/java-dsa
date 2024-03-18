package com.nazma;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] num = {-32, -21, -12, 1, 12, 18, 25, 29, 32, 43, 45, 67, 89};
        int target = 27;
        int ans = findFloor(num, target);
        System.out.println(ans);
    }

    static int findFloor(int[] num, int target) {
        int start = 0;
         int end = num.length -1;
         while (start <= end) {
             int mid = start + (end -start) / 2;
             if(num[mid] == target) {
                 return mid;
             } else if(num[mid] > target) {
                 end = mid -1;
             } else {
                 start = mid + 1;
             }
         }

         return end;
    }
}

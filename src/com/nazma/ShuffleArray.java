package com.nazma;
import java.util.Arrays;
import java.util.Scanner;
public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,76,1};
        int[] anArr = {2,1,4,4,6,7,9,3,7, 9};
        int len = arr.length;
        int len2 = anArr.length;
        System.out.println(len);

        int[] ans = shuffleArray(arr, len/2);
        int[] ans2 = shuffleArray(anArr, len2/2);

        // input =   {2, 3, 4, 5, 76, 1}
        //index =    {0, 1, 2, 3, 4,  5}
        // output  = {2, 5, 3, 76, 4, 1}
        // index      0, 3, 1,  4, 2, 5

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));
    }

    static int[] shuffleArray(int[] nums, int n) {
        int[] ans = new int[n*2];
        int len = n;
        for (int i = 1, j = 0; i <= n*2; i += 2, j++) {
            ans[i-1] = nums[j];
            ans[i] = nums[len];
            len++;

        }
        return ans;
    }

}

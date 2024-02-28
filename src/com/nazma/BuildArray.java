package com.nazma;
import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the num array");
        int len = scanner.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] ans = buildArray(nums);

        System.out.println(Arrays.toString(ans));


    }

    static int[] buildArray(int[] nums) {
        int lenAr = nums.length;
        int[] ans = new int[lenAr];

        for(int i = 0; i< lenAr; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}

package com.nazma;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0, 1, 2, 2, 1};
        int[] target = createTargetArray(arr, index);

        System.out.println(Arrays.toString(target));
    }

    static int[] createTargetArray(int[] arr, int[] index) {
        ArrayList<Integer> target = new ArrayList<Integer>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            target.add(index[i], arr[i]);
        }
   int[] ans = new int[arr.length];
        for (int i = 0; i < index.length; i++) {
            ans[i] = target.get(i);
        }
        return  ans;
    }
}

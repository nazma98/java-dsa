package com.nazma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
//        int[] digits  = {1, 2, 3, 9};
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int len =digits.length;
        int carry = 1;
        int sum = 0;
        for (int i = len - 1; i >= 0 ; i--) {
        sum = digits[i] + carry;
        if (sum > 9) {
            list.add(sum % 10);
            carry = 1;
        } else {
            list.add(sum);
            carry = 0;
        }

        }
        if (carry == 1) {
            list.add(carry);
        }
        Collections.reverse(list);

        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) array[i] = list.get(i);

        return array;
    }
}

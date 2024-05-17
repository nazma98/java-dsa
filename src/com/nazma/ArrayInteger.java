package com.nazma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverse;

public class ArrayInteger {
    public static void main(String[] args) {

//        int[] num = {1,2,0,0};
//        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int[] num = {2, 7, 4};
//        System.out.println(addToArrayForm(num, 1));
        System.out.println(arrayform(num, 455));

    }

    static List<Integer> arrayform(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        int carry = 0;
        for (int i = num.length-1; i >= 0; i--) {
            while (k!=0) {
                int rem = k % 10;
//                list.add(rem + num[i] % 10);
                if(rem + num[i] > 9) {
                    list.add((rem + num[i] + carry) %10);
                    carry = 1;
                } else  {
                    list.add((rem + num[i] + carry )% 10);
                    carry = 0;
                }
                k /= 10;
                i--;
            }
            if(i==0) {
                break;
            }
            if(num[i] + carry > 9) {
                list.add((num[i] + carry) % 10);
                carry = 1;
            } else {
                list.add(num[i] + carry);
                carry = 0;
            }

        }
        if (carry == 1){
            list.add(carry);
        }

        reverse(list);
        return list;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum = sum*10 + num[i];
        }

        System.out.println(sum);

        sum += k;
        int rem ;
        while(sum!=0) {
            rem = (int)sum % 10;
            list.add(rem);
            sum /= 10;
        }
        reverse(list);
        return list;
    }
}

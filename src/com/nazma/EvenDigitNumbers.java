package com.nazma;

public class EvenDigitNumbers {
    public static void main(String[] args) {
        int[] nums ={12, 342, 2 ,6, 7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int cnt = 0;
        for(int elem : nums) {
            if(checkDigitEven(elem)) {
                cnt++;
            }
        }

        return cnt;
    }

    public static boolean checkDigitEven(int num) {
        int rem;
        int cnt = 0;
        while(num!=0) {
            rem = num % 10;
            num /= 10;
            cnt++;
        }

        if(cnt%2 == 0) {
            return true;
        }

        return false;

    }
}

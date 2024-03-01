package com.nazma;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
//        System.out.println(findMaxCandy(candies));
        System.out.println(kidsWithCandies(candies, 3));

    }
        static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int maxCandy = findMaxCandy(candies);
            int child = candies.length;
            // List<Boolean> candiesResult = new List<Boolean>();
            ArrayList<Boolean> candiesResult = new ArrayList<Boolean>(child);


            for(int i=0;i<child; i++) {
                if(candies[i]+extraCandies >= maxCandy) {
                    candiesResult.add(true);
                } else {
                    candiesResult.add(false);

                }
            }

            return candiesResult;

        }

        static int findMaxCandy(int[] candies) {
            int len = candies.length;
            int max = -99999999;
            for(int i=0; i<len; i++) {
                if(max < candies[i]) {
                    max = candies[i];
                }
            }

            return max;
        }
    }

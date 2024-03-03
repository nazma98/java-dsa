package com.nazma;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        int initAlt = 0;
        int max = 0;
        for(int i=0; i< gain.length; i++) {
            initAlt += gain[i];
            System.out.println("Altitudes "+ initAlt);
            if(initAlt > max) {
                max = initAlt;
                System.out.println("Max "+ max);
            }
        }

        return max;
    }
}

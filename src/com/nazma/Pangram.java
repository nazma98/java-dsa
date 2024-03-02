package com.nazma;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence2 = "leetcode";
        System.out.println(checkIfPangram(sentence));
        System.out.println(checkIfPangram(sentence2));
    }

    // Best solution
    public static boolean checkPangram(String sentence) {
        int i = 0;
        for(char ch='a'; ch <= 'z' ; ch++) {
            if(sentence.indexOf(ch) != -1) {
                i++;
            }
        }


        return i>= 26;
    }

    // okay solution

    public static boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) {
            return false;
        }

        int[] arr = new int[26];

        for(char ch : sentence.toCharArray()) {
            arr[ch%97]++;
        }

        for(int i=0; i< arr.length; i++) {
            if(arr[i]==0) {
                return false;
            }
        }

        return true;
    }
}

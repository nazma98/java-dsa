package com.nazma;

public class LinearSearchString {
    public static void main(String[] args) {
        String name = "Nazma";
        char target = 'z';

        System.out.println(search(name, target));
        System.out.println(searchElem(name, target));
    }

    static int search(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    static char searchElem(String name, char target) {
//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) == target) {
//                return name.charAt(i);
//            }
//        }

        for (char elem : name.toCharArray()) {
            if (elem == target) {
                return elem;
            }
        }

        return '?';
    }



}

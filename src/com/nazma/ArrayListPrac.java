package com.nazma;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(10);
//        list.add(12);
//        list.add(312);

        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt()) ;
        }


        System.out.println(list);
    }
}

package com.nazma;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(someMethod(0));
    }

    static int someMethod(int a){
        if(a >= 3) {
            return a;
        }
        return someMethod(a + 1) + someMethod(a+2);
    }
}

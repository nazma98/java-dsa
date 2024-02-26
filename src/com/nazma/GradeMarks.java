package com.nazma;

import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks ");
        int marks = scanner.nextInt();
        String grade = findGrades(marks);

        System.out.println(grade);
    }

    static  String findGrades(int marks) {
        if (marks > 90 && marks < 101) {
            return "AA";
        }
        if(marks >80 && marks < 91) {
            return "AB";
        }
        if(marks > 70 && marks < 81) {
            return "BB";
        }
        if (marks > 60 && marks < 71) {
            return "BC";
        }
        if(marks > 50 && marks < 61) {
            return "CD";
        }
        if(marks > 40 && marks < 51) {
            return "DD";
        } else {
            return "Fail";
        }

    }
}

package com.nazma;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
        int i, cnt=0, rem, temp, temp2, sum=0;

           temp = temp2 = num1;
            while(num1>0){
                rem = num1 % 10;
                num1 /= 10;
                cnt++;
            }

            while(temp > 0) {
                rem = temp % 10;
                temp /= 10;
                sum += Math.pow(rem, cnt);
            }

        System.out.println(sum);

            if(sum == temp2) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not Armstrong number");
            }

//        for(i=num1; i <= num2; i++) {
//            temp = i;
//            while(i>0){
//                rem = i % 10;
//                i /= 10;
//                cnt++;
//            }
//            System.out.println(cnt);
//            while(temp > 0) {
//                rem = temp % 10;
//                temp /= 10;
//                sum += Math.pow(rem, cnt);
//            }
//            if(sum == i) {
//                System.out.println(i + "is an Armstrong number");
//            }
//        }

    }
}

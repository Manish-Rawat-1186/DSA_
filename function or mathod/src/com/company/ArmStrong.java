package com.company;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        // three digit armstrong no.
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        boolean ans = isArmstrong(num);
//        System.out.println(ans);
        for (int i =0; i<1000; i++){
            if (isArmstrong(i)){
                System.out.println(i + "");
            }
        }

    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int a = n %10;
            n = n / 10;
            sum = sum + a*a*a;
        }
        return sum == original;
    }
}

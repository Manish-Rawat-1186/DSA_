package com.company;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = input.nextInt();

        int count = 0;
        while (num>0){
            if (num%10 == n){
                count++;
            }
            num = num/10;

        }
        System.out.println(count);

    }
}

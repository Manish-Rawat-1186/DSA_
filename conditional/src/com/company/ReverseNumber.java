package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int count = 0;
        while (num>0){
            int n = num % 10;
            count = (count * 10) + n ;
            num = num/10;
        }

        System.out.println(count);
    }
}

package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean prime = isPrime(num);
        System.out.println(prime);


    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <= n ){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}

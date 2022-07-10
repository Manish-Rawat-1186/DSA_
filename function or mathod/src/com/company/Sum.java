package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        System.out.println(sum2());
        System.out.println(sum3(23, 89));

    }

    // pass the value of numbers when you are calling the mathod in java;

    static int sum3(int a, int b){
        int sum = a + b;
        return  sum;
    }

    //return a value

    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1 ,  num2 , sum;
        System.out.print("enter the first no. : ");
        num1 = input.nextInt();
        System.out.print("enter the second no. : ");
        num2 = input.nextInt();
        sum = num1 + num2;
        return  sum;

    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        int num1 ,  num2 , sum;
        System.out.print("enter the first no. : ");
        num1 = input.nextInt();
        System.out.print("enter the second no. : ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("sum is : " + sum );

    }
}

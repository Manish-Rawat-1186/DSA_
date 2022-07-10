package com.company;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Q: find the largest of the 3 numbers.

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);

//        System.out.println("Largest is : ");
//
//        if (max<b){
//            System.out.println(b);
//        }else if(max<c){
//            System.out.println(c);
//        }else {
//            System.out.println(max);
//        }





    }

 }

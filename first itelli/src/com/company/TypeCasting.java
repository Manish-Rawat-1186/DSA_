package com.company;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextInt();
        //type casting
        int num = (int)(2.232f);

        //automatic type promotion in expression

//        int a = 257;
//        byte b = (byte)(a);

//          byte a = 40;
//          byte b = 50;
//          byte c = 100;
//
//          int d = (a*b)/c;

//        int Number = 'A';

        byte b = 43;
        char c = 'a';
        int d =56;
        float e = 0.434f;
        double f = 0.4343;
        byte g = (byte) (b*c);

        double result = (b*c) + (c*d) - (e-f);
        System.out.println((b*c) + " " + (c*d) + " " + (e-f));

        System.out.println(result);
        System.out.println(g);

    }

}

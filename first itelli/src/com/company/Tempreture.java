package com.company;

import java.util.Scanner;

public class Tempreture {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter temp in c :");

        float temp = input.nextFloat();

        float tempF = (temp * 9/5) + 32;

        System.out.println(tempF);

    }

}

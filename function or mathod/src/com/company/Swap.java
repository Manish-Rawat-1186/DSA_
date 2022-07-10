package com.company;

public class Swap {
    public static void main(String[] args) {

        int a  = 10;
        int b  = 20;

        swap(10, 20);
        System.out.println(a + " " + b);

    }

    // swap the numbers

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

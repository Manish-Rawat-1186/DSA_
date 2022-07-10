package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        //input
        for (int i =0; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        //output
//        for (int num : arr) {//for every element in array , print the element
//
//            System.out.print(num + "");// here num represents elenment of the array
//        }

        System.out.println(Arrays.toString(arr));//best way to print

    }
}

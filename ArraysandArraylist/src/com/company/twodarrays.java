package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class twodarrays {
    public static void main(String[] args) {
        //syntex
        // int[][] arr = new int[3][2]
        Scanner input = new Scanner(System.in);

//        int[][] arr = {
//                {1,2,3},//it may be {34,3}
//                {4,5},//or{4}
//                {7,9,4,34}//{8,9,3,4}//diffrent no. of array in the array
//                //so that's why coloum is not such usefull.
//        };
        int[][] arr = new int[3][2];
//        System.out.println(arr.length);//no of rows

        //input
        for (int row = 0; row < arr.length; row++)
        {  //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
         }

            //output
        for (int[] ints : arr) {

            System.out.println(Arrays.toString(ints));
            //for each col in every row
//                for (int col = 0; col < arr[row].length; col++) {
//                    System.out.print(arr[row][col] + " ");
//                }
            System.out.println();//for in matrix for
        }
    }
}

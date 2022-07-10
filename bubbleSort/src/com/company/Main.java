package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[]  arr = {5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //now find the correct index in remaining array and swap with correct index.
            int last = arr.length - i-1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for ( int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i ;
            }
        }
        return max;
    }

    static void swap( int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    static void bubble(int[] arr){
        //run step till n-1
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            //now comparison
             swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]){
                    //swap
                    swap(arr, j ,j-1);
                    swapped = true;
                }
            }

            //if elements are not swap it means that are all in sorted then stop the program
            if (!swapped) {
                 break;
            }

        }
    }

}

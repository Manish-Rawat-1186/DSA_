package com.company;

import java.util.Arrays;

public class doubleExit {
    public static void main(String[] args) {
      int[] arr = { -2,0,10,-19,4,6,-8};
        System.out.println(isDoubleExits(arr));
    }

    //sout the array
    // create a count
    // then use binary search to find his double

    static boolean isDoubleExits(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        while (count < arr.length){
                int num = arr[count];
                if (binarySearch(arr,2*num)){
                    return true;
                }else {
                    count++;
                }
        }

        return false;
    }

    static boolean binarySearch(int[] arr, int n){
        int start = 0;
        int end = arr.length -1;

        while (start <= end ) {
            int mid = start + ( end - start)/2;
            if (arr[mid] == n) {
                return true;
            }
            if (arr[mid] > n){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }

}

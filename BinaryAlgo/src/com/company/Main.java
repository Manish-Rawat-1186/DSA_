package com.company;

import java.time.chrono.MinguoDate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {-12, -2, 0, 23, 45, 78, 89, 98, 112, 114, 123, 134, 145, 156, 178, 987};
        int target = 156;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
//        int mid = (start + end) / 2; it may exceed the range of integer so ..
            // best way to find mid is
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if ((target == arr[mid])) {
                return mid;
            }
        }

         return -1; // when no return

    }

}

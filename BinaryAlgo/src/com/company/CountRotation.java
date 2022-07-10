package com.company;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class CountRotation {
    public static void main(String[] args) {
        int[] nums = {7, 9, 11, 12, 15};//7, 9, 11, 12, 5 or 7, 9, 11, 12, 15 or 15, 18, 2, 3, 6, 12
        int countOfRotation = findPivot(nums) + 1;
        System.out.println(countOfRotation);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start<end){
            int mid = start + (end - start)/2;
            //don't forget boundary conditions.
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if (arr[mid] < arr[start]){
                end = mid -1;
            }else{
                start = mid+1;
            }

        }
        return -1;

    }

}

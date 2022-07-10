package com.company;

public class Main {

    public static void main(String[] args) {

        int[] nums = {12, 13, 24, 54, 23 ,24 ,342};

        int target = 2;

        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    //search in the array return if index found
    //otherwise return -1;

    static int linearSearch(int[] arr, int target){

        // edge case
        if (arr.length == 0){
            return -1;
        }

        //for loop

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target){
                return i;
            }

        }

        //hence mean item is not found.
        return -1;



    }

}

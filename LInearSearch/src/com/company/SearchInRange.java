package com.company;

public class SearchInRange {

    public static void main(String[] args) {

        int[] nums = {12, 34, 53, 45, 676, 87, 55, 435, 678, 980, 987};
        int ans = search(nums, 12, 1, 9);
        System.out.println(ans);

    }

    static int search(int[] arr, int target,  int start, int end){
        //edge case
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] == target){
                return i;
            }
        }

        return -1;

    }

}

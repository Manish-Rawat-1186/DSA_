package com.company;

public class FloorNo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 12, 14, 18};
        int target = 5;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor (int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end ){
            int mid = start + (end - start )/2;

            if (arr[mid] == target){
                return target;
            }

            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }
        }

        return arr[end];
    }


}

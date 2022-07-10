package com.company;

public class orderAgnostic {

    public static void main(String[] args) {

        int[] arr = {90, 76, 18, 12, 6, 4, 3, 1};
        int target = 76;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start )/2;
            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
            }
        } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
            }
            }
        }

        return -1;
    }
}

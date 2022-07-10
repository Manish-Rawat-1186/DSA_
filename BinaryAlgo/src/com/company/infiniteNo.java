package com.company;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class infiniteNo  {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        // setting start or end index
         while (target > arr[end]){
             //here we can't do like start = end + 1;
             //because start  already defined
             //so use temp method
             int temp = end + 1;
             //end = previous end + sizeofBox*2;
             end = end + (end - start + 1)*2;
             start = temp;
         }
         return search(arr, target, start, end);
    }

    static int search( int[] arr, int target, int start, int end) {
        //binary search
        while (start <= end ){
            int mid = start + (end - start )/2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

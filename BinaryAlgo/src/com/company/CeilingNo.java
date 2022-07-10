package com.company;

public class CeilingNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 14;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling (int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //using binary algo
        while (start <= end ){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return arr[mid];
            }

            if(arr[mid] < target){
                start = mid +1;
            }else if(arr[mid] > target ){
                end = mid -1;
            }
        }

        return arr[start];//it is closest value
    }

}

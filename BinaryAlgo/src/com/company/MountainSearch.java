package com.company;

public class MountainSearch  {
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 4, 5, 7, 6, 5, 3, 0};
        int target = 5;
        int start = 0;
        int end = peakIndex(mountainArr);
        int index = binarySearch(mountainArr, target, start, end);
        if (index == -1){
            start = peakIndex(mountainArr);
            int temp = binarySearch(mountainArr, target, start, end);
            index = temp;
        }
        System.out.println(index);

    }

    static int binarySearch(int[] nums, int target, int start , int end){
        while (start<=end){
            int mid = start + (end - start)/2;
            if (nums[mid]<target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int  peakIndex(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]){
                //increasing go right
                int temp = mid + 1;
                start = temp;
            }else {
                //decreasing go left
                end = mid;
            }
        }
        return end;
    }
}

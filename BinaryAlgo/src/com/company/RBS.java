package com.company;

public class RBS {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int start = 0;
        int end = nums.length-1;
        int pivot = pivot(nums);
        if (pivot == -1 ){
            System.out.println(binarySearch(nums, target, start, end));
        }else {
            if (target == nums[pivot]) {
                System.out.println(pivot);
            }
            if (target >= nums[0]) {
                System.out.println(binarySearch(nums, target, 0, pivot));
            } else {
                System.out.println(binarySearch(nums, target, pivot + 1, end));
            }
        }


    }
        //it doesn't work with duplicate element
    static int pivot(int[] nums){
        int start =  0;
        int end = nums.length -1;

        while (start <= end ){
            int mid = start + (end - start)/2;
            // first and second case to defined pivot
            if ( mid < end &&  nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid-1] > nums[mid]){
                return mid -1;
            }
            //ignoring extra elements.
            //pivot is greatest element in array
            //it isn't work on duplicate array.
            if (nums[mid] < nums[start]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums , int target, int start, int end){
        while (start<= end){
            int mid = start + (end - start)/2;
            if (target > nums[mid]){
                start = mid + 1;
            }else if (target < nums[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}

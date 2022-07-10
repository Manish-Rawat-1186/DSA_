package com.company;

public class DuplicateRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 9, 2, 5};
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

            //we just skip those elements which are same
            //also we consider that start or end are not pivot
            if (nums[mid] == start && nums[mid] == end){
                //start element is pivot
                if (nums[start] > nums[start+1] ){
                    return start;
                }
                start++;

                //check end element is pivot
                if (nums[end] < nums[end-1]){
                    return end;
                }
                end--;
            }

            //left side is sorted , so pivot should be in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }else {
                end= mid -1 ;
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

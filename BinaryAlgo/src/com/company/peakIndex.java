package com.company;

public class peakIndex {
    public int findPeakElement(int[] nums) {
        //mountain array like
        //key point if mid < mid+1 so increasing order peak in right
        //if mid > mid+1 so decreasing order peak in left

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

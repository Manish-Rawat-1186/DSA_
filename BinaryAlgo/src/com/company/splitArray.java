package com.company;

public class splitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        //get the bounds
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        //binary search
        while (start < end){
            // try for the middle as possible ans
            int mid = start + ( end - start)/2;

            // calculate how many piecs you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num: nums){
                if (sum + num > mid ){
                    // you cannot add this in this subarray, make a one
                    //say you add this num in a new subarray , then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m ){
                start = mid + 1;
            }else {
                end = mid;
            }
        }

        return end;//here start == end

    }

}

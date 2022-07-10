package com.company;

import java.util.Arrays;
import java.util.Collections;

//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
public class Streak1 {
    public static void main(String[] args) {
        int[] nums = {1,0,0,8,6};
//        Arrays.sort(nums);
//        int median = nums[nums.length/2];
//        int count = 0;
//        for (int num : nums) {
//            count += Math.abs(num - median);
//        }
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length -1;
        int count = 0;
        while (start < end ){
            count += nums[end] - nums[start];
            start++;
            end--;
        }

        System.out.println(count);
    }
}

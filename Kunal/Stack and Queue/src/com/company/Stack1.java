package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-i/
public class Stack1 {
    public static void main(String[] args) {
        int[] nums2 = {6,5,4,3,2,1,7};
        int[] nums1 ={1,3,5,2,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && stack.peek() < nums2[i])
                map.put(stack.pop(), nums2[i]);
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        System.out.println(Arrays.toString(nums1));

    }
}

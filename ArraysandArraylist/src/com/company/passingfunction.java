package com.company;

import java.util.Arrays;

public class passingfunction {
    public static void main(String[] args) {
        int[] nums = {2,3,2,1,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums
        ));
    }
    static void change(int[] arr){
        arr[0] = 4334;
    }
}

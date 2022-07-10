package com.company;

public class MinNO {
    public static void main(String[] args) {
        int[] nums = {12, 34, 53, 45, 676, 87, 55, 435, 678, 980, 987};
        int MinNumber = Min(nums);
        int MaxNumber = Max(nums);
        System.out.println(MaxNumber);
        System.out.println(MinNumber);
    }

    static int Min(int[] arr){
        int min = arr[0];

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;

    }

    static int Max(int[] arr){
        int Max = arr[0];

        for (int j : arr) {
            if (j > Max) {
                Max = j;
            }
        }
        return Max;

    }

}

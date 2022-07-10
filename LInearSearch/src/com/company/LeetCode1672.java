package com.company;

public class LeetCode1672 {
    public static void main(String[] args) {
            int[][] arr = { { 1,2,}, {3,2,1,8}, {7,67,334,45}};
            int rich = wealth(arr);
            System.out.println(rich);

    }

    static int wealth(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] rows : arr) {
            int num = 0;
            for (int col : rows) {
                num = num + col;
            }
            max= Math.max(num, max);
        }
        return max;

    }



}

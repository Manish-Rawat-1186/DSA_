package com.company;

public class MaxAndMinIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {{4, 2, 34, 56}, {23, 45, 67, 87,9}, {78, 1, 654, 342, 6789, 5643}};
        int MinNo = Min(arr);
        int MaxNo = Max(arr);
        System.out.println(MaxNo);
        System.out.println(MinNo);
    }

    static int Min(int[][] arr){

        int min = Integer.MAX_VALUE;

        for (int[] rows : arr) {
            for (int col : rows) {
                if (col < min) {
                    min = col;
                }
            }
        }

        return min;
    }

    static int Max(int[][] arr){

        int max = Integer.MIN_VALUE;

        for (int[] rows : arr) {
            for (int col : rows) {
                if (col > max) {
                    max = col;
                }
            }
        }

        return max;
    }

}

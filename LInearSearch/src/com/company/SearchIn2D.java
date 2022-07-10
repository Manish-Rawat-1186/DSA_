package com.company;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 34, 56}, {23, 45, 67, 87,9}, {78, 98, 654, 342, 6789, 5643}};
        int target = 98;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        //ege condition
        if (arr.length == 0){
            return new int[]{};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] == target){
                            return new int[]{i,j};
                        }
            }
        }

         return new int[]{};

    }

}

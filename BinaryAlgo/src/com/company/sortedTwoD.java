package com.company;

import java.util.Arrays;

public class sortedTwoD {
    public static void main(String[] args) {
            int[][] arr = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] binarySearch(int[][] arr, int cStart, int cEnd, int target, int row){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if (arr[row][mid] == target){
                return new int[]{row,mid};
            }

            if (arr[row][mid] > target){
                cEnd = mid-1;
            }else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int col = arr[0].length;

        //for edge case
        if (rows == 1){
            return binarySearch(arr,0, col-1, target, 0);
        }

        //try to reduce space till 2 row
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = col/2;
        while (rStart< (rEnd -1)){
            int mid = rStart + (rEnd - rStart)/2;
            if (arr[mid][cMid] == target){
                return new int[]{mid,cMid};
            }

            if (arr[mid][cMid] > target){
                rEnd = mid;
            }else {
                rStart = mid;
            }

        }
        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (arr[rStart+1][cMid] == target){
            return new int[]{rStart, cMid};
        }

        //search in 1st half
         if (target <= arr[rStart][cMid-1]){
            return binarySearch(arr,0,cMid-1,target,rStart);
         }

         //search in 2st half
        if (target >= arr[rStart][cMid +1] && target <= arr[rStart][col -1]){
            return binarySearch(arr, cMid+1, col-1, target,rStart);
        }

        //search in 3st half
        if (target <= arr[rStart+1][cMid-1] ){
            return binarySearch(arr, 0, cMid-1, target, rStart+1);
        }else {
            return binarySearch(arr, cMid+1, col-1, target, rStart+1);
        }

    }

}

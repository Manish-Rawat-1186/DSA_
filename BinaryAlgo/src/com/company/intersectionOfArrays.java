package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfArrays {
    public static void main(String[] args) {
        int[] num1 = {4,4,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    static int[] intersection(int[] num1, int[] num2){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(num2);
        for (int j : num1) {
            if (binarySearch(num2, j)) {
                ans.add(j);
            }
        }
        int i=0;
        int[] result = new int[ans.size()];
        for (int j : ans){
            result[i++] = j;
        }
        return result;
    }

    static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return true;
            }

            if (arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }

}

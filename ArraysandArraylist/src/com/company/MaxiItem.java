package com.company;

public class MaxiItem {
    public static void main(String[] args) {
        int[] arr = { 12 , 34 , 45, 9867, 563, 897, 87 };
        int number = maxitem(arr);
        System.out.println(number);
        System.out.println(range(arr, 1 , 5));

    }

    static int range (int[] arr , int index1, int index2){
        //edge cases


        if (arr == null){
            return -1;
        }

        int count = 0;
        for (int i = index1 ; i <= index2 ; i++){
            if (arr[i]>count){
                count = arr[i];
            }
        }
        return count;

    }

    static int maxitem(int[] arr){
        //edge case
        if (arr==null){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i]>count){
                count = arr[i];
            }
        }
        return  count;
    }

}

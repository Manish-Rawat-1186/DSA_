package com.company;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2,433, 232,233};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeValue(int[] num){
        num[3] = 0;// if you make a change to the object via this ref variable.
    }

}

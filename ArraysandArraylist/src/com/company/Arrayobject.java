package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayobject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0 ; i < str.length ; i++){
             str[i] = in.next();
        }
        //modify
        str[3] = "kunal";
        System.out.println(Arrays.toString(str));
    }
}

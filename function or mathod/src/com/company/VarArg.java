package com.company;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        vararg(1,2,3,4,5,43,43,22,323,2,3,22,323);

        varString(3,4, "kunal khuswaha");
        // so basically variable length argument comes in the end.

    }

    static void varString(int a, int b, String ...v){

    }

    static void vararg(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

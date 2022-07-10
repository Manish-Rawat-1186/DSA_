package com.company;

import java.util.Arrays;

public class OverLoading {
    public static void main(String[] args) {
        fun(3);
        fun("manish jataw");
        System.out.println(sum(5,3));
        System.out.println(sum(8, 0, 87));
        demo(3,4,3,232,3223,232);
        demo("manish jataw");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun (String name){
        System.out.println(name);
    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}

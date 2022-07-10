package com.company;

public class shadowing {

    static int x = 98;// this will be shadowed at line 9,


    public static void main(String[] args) {
        System.out.println(x);//98
        int x = 89;// the class variable at line 5 is shadowed by this
        /*
        this scope only for this block or kihg of first king if ,
        it is not here then our second king would be our one level up
        block's king.
        or

        */
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }

}

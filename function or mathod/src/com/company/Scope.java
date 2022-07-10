package com.company;

public class Scope {
    public static void main(String[] args) {
        int a = 89;
        int b = 97;
        String name = "manish";

        {
            // int a = 90 , already initialized outside the block is not initialized again in block
            a = 76; // yeah you can modifie the value ;
            int c = 65;
            name = "muskan";
            //values initialised in this block will remain in the block.
            System.out.println(c);
        }

        System.out.println(a);
        System.out.println(name);

        //System.out.println(c); // cannot use outside the block,

    }
}

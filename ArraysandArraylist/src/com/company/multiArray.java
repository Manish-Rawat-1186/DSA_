package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class multiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        for (int i = 0; i < 3 ; i++){
                list.add(new ArrayList<>());
        }

        //add element

        for (int i= 0; i <3; i++){
            for (int j = 0; j < 3 ; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        //print
        System.out.println(list);

    }
}

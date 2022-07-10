package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        //adding item
        list.add(67);
        list.add(78);
        list.add(76);
        list.add(45);
        list.add(56);
        list.add(85);
        list.add(65);
        list.add(45);
        list.add(4);

        //print
        System.out.println(list);

        //checking wheather is it or not.

        System.out.println(list.contains(67));

        //update the list
        list.set(0, 8787);

        //remove
        list.remove(3);

        //print
        System.out.println(list);

        //input


    }
}

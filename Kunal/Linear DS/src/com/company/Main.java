package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(0);
        ls.add(1);
        int sum = 0;

        for (int i = 0; i < ls.size(); i++) {
            sum += Math.pow(2, i) * ls.get(i);
        }

        System.out.println(sum);
    }
}

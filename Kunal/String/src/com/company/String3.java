package com.company;

import java.util.Arrays;

//https://leetcode.com/problems/goal-parser-interpretation/
public class String3 {
    public static void main(String[] args) {
        String command = "G()(al)";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') str.append("G");
            if ( command.charAt(i) == '('){
                if (command.charAt(i+1) == ')'){
                    str.append("o");
                    i++;
                }else {
                    str.append("al");
                    i += 3;
                }
        }
        }
        System.out.println(str.toString());
    }
}

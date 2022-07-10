package com.company;

import java.util.Stack;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class Stack5 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        String s = "abbaca";
        for (int i = 0; i < s.length(); i++) {
            int size = str.length();
            if (size > 0 && s.charAt(i) == str.charAt(size-1)) str.deleteCharAt(size-1);
            else str.append(s.charAt(i));
        }
        System.out.println(str);
    }

}

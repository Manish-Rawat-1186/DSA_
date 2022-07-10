package com.company;

//https://leetcode.com/problems/remove-outermost-parentheses/
public class Stack4 {
    public static void main(String[] args) {
        String str = " (()())(())";
        StringBuilder newstr = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' && count > 0){
                newstr.append(str.charAt(i));
                count += 1;
            }
            if (str.charAt(i) == ')' && count > 1){
                newstr.append(str.charAt(i));
                count -= 1;
            }
        }
        System.out.println(newstr.toString());
    }
}

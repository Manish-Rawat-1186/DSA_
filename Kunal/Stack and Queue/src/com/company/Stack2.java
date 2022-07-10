package com.company;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class Stack2 {
    public static void main(String[] args) {
        String s = "()[]{}";
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if (ch.length == 1) System.out.println(false);
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) System.out.println(false);
        }
        System.out.println(true);
    }
}

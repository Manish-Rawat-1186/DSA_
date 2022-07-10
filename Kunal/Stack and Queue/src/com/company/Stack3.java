package com.company;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/
public class Stack3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> min_val = new Stack<>();
        stack.peek();
        min_val.peek();
        min_val.isEmpty();
        stack.peek().equals(min_val.peek());
    }

}

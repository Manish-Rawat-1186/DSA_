package com.company;


import java.util.Stack;

//https://leetcode.com/problems/design-a-stack-with-increment-operation/
public class Stack5M    {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(3);
        stack.push(3);
        int k = 2;
        int n = 3;
        int val = 100;
        int min = Math.min(k, n) ;
        for(int i=0 ; i < min ; i++){
            stack.set(i, stack.get(i)+val);
        }
        System.out.println(stack);

    }
}

package com.company;

//https://leetcode.com/problems/shuffle-string/
public class String2 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        char[] word = new char[indices.length];
        char[] c = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            word[indices[i]] = c[i];
        }
        System.out.println(String.valueOf(word));
    }
}

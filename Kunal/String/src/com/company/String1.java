package com.company;
//https://leetcode.com/problems/defanging-an-ip-address/
public class String1 {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        char[] c = address.toCharArray();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
           if (c[i] == '.') str.append("[.]");
           else str.append(c[i]);
        }
        System.out.println(str.toString());
    }

}

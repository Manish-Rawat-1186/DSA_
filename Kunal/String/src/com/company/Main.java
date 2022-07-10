package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String a = "kunal kushwaha";
        String b = "kunal" + "manish";
        System.out.println(a + b);
        char[] c = a.toCharArray();
        System.out.println(c[0]);

//
//        System.out.println( 'a' + 'b');
//        System.out.println("a" + "b");
//        System.out.println((char) ('a' + 1));

        String sr = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            sr += ch;
        }


        System.out.println(sr);

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 12; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());




    }
}

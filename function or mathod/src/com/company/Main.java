package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        greeting();
//        greeting();
//        greeting();
//         String massage = greet();
//        System.out.println(massage);
        String massage = greeting("manish jataw");
        System.out.println(massage);
    }

    // return a string

    static String greet(){
        String greeting = "how are you";
        return greeting;
    }

    static String greeting(String name){
        String massage = "hello " + name;
        return  massage;
    }

    /*
         return _type name (arguments){
         //body
           return statement;
           }
    */

}

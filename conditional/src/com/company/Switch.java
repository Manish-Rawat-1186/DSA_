package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 /*       String fruit = input.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits.");
//            case "apple" -> System.out.println("A sweet red fruits.");
//            case "orange" -> System.out.println("sour fruit");
//            case "banana" -> System.out.println("good fruits");
//            default -> System.out.println("please enter a valid fruits..");
//        }  */

        int day = input.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("sunday");
//            case 2 -> System.out.println("monday");
//            case 3 -> System.out.println("tuesday");
//            case 4 -> System.out.println("wednesday");
//            case 5 -> System.out.println("thursday");
//            case 6 -> System.out.println("friday");
//            case 7 -> System.out.println("satuday");
//
//            default -> System.out.println("please enter valid code");

       switch (day){
           case  1,2,3,4,5 -> System.out.println("weekday");
           case 6,7 -> System.out.println( "weekend");
        }
    }
}

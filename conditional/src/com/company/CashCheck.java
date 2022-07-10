package com.company;

import java.util.Scanner;

public class CashCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'b'){
            System.out.println("latter is in lowwer case ");

        }else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("letter is in upper case");}

    }
}

package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //take input till user does not press X or x

        int ans = 0;

        while (true){
            //taking operator
            System.out.print("enter an operator : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //taking to input
                System.out.print("enter two number : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                    System.out.println(ans);
                }
                if (op == '-'){
                    ans  = num1 - num2;
                    System.out.println(ans);
                }
                if (op == '*'){
                    ans  = num1 * num2;
                    System.out.println(ans);
                }
                if (op == '/'){
                    if (num2 != 0){
                        ans  = num1 / num2;
                        System.out.println(ans);
                    }
                }
                if (op == '%') {
                    ans = num1 / num2;
                    System.out.println(ans);
                }

            } else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("invalid input");
            }
        }



    }
}

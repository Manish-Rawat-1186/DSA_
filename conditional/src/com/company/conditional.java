package com.company;

import java.util.Scanner;

public class conditional {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if (salary <= 10000 ) {
            salary += 5000;
            System.out.println(salary);
        }else  if (salary >= 20000  && salary<=50000){
            salary +=4000;
            System.out.println(salary);
        }else {
            System.out.println("gift");
        }

    }
}

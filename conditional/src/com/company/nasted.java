package com.company;

import java.util.Scanner;

public class nasted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();


        // better way to write.
        switch (empId) {
            case 1 -> System.out.println("kunall kushwaha");
            case 2 -> System.out.println("manish jataw");
            case 3 -> {
                System.out.println("employ id 3");
                switch (department) {
                    case "IT" -> System.out.println("department is IT");
                    case "Managemaent" -> System.out.println("Mangement department");
                    default -> System.out.println("no department choosen");
                }
            }
            default -> System.out.println("enter correct empId");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; n--) {
            int count = 0;
            int start = input.nextInt();
            int end = input.nextInt();

            for (int j = start ; j <= end ; j++) {
                int y = j%10;
                if (y==2 || y==3 || y==9){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

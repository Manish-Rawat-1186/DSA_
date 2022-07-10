package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<String> game = new Stack<>();
        game.add("manish");
        game.add("call of duty");
        System.out.println(game);
        game.pop();
        game.push("mario");
        game.add(0, "kunal");

        Queue<String> name = new LinkedList<>();
        Deque<String> rollno = new ArrayDeque<>();
        //Array Deque no capacity restistions
        rollno.add("mansih");
        rollno.removeFirst();
        //in this array we can delete first and from end

        System.out.println(game);
        System.out.println(game.pop());
    }
}

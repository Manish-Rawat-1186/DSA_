package com.company;

public class seachInString {
    public static void main(String[] args) {

        String name = "manish jataw";
        char target = 'n';
        boolean ans = searchString(name, target);
        System.out.println(ans);

    }

    static boolean searchString(String str, char target){
        //edge condition
        if (str.length()==0){
            return false;
        }

        //for loop
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }

        //when iten wasn't.
        return false;

    }

}

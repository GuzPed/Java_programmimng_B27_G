package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /*
    Hide passwords

Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
Ex:
Input:
{"one", "hi", "hold}

Output:
[ ***, **, **** ]
     */
    public static void main(String[] args) {
        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        ArrayList<String> hiddenPassword = new ArrayList<>();
        String star = "*";

        for (String each : password) {
            hiddenPassword.add(star.repeat(each.length()));
        }
        System.out.println(hiddenPassword);


        System.out.println("====================================================");
        ArrayList<String> passwordNew = new ArrayList<>(Arrays.asList("one", "hi", "hold", "mamamama"));
        System.out.println(hidePassword(passwordNew));


//        // OR without new ArrayList
//        ArrayList<String> password1 = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
//        String star1 = "*";
//
//        for (String each: password1) {
//            each = each.replace(each, star1.repeat(each.length()));
//        }
        //       System.out.println(password1);


    }

    public static ArrayList<String> hidePassword(ArrayList<String> list) {
        ArrayList<String> hiddenPasswordNew = new ArrayList<>();

        for (String each: list) {
            hiddenPasswordNew.add(numsOfStarts(each.length()));
        }
       return hiddenPasswordNew;

    }



public static String numsOfStarts (int length) {

    String starNew = "";
    for (int i=0; i<length; i++){
        starNew +="*";
    }
    return starNew;
} }

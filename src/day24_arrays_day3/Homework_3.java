package day24_arrays_day3;

import java.util.Arrays;

public class Homework_3 {
    public static void main(String[] args) {
        /*
        Given a String array:

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array
         */
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"};

        for (String each: countries) {
            System.out.println("" + each.charAt(0) + each.charAt(each.length()-1));


            if (each.length()%2!=0) {
            System.out.println(each.charAt(each.length()/2));
        } else if (each.length()%2==0) {
                System.out.println("" + each.charAt(each.length()/2-1) + each.charAt(each.length()/2));
        }
            if (each.contains(" ")) {
                int indexOfSpace = each.indexOf(" ");
                String first = each.substring(0,indexOfSpace);
                String second = each.substring(indexOfSpace+1);
                String[] abc = {first,second};

                for (String eachEach: abc) {
                    System.out.println("" + eachEach.charAt(0) + eachEach.charAt(first.length()-1));
                    if (eachEach.length()%2!=0) {
                        System.out.println(eachEach.charAt(eachEach.length()/2));
                    } else if (eachEach.length()%2==0) {
                        System.out.println("" + eachEach.charAt(eachEach.length()/2-1) + eachEach.charAt(eachEach.length()/2));

                    }


                }}


            char[] a = each.toCharArray();
            System.out.println(Arrays.toString(a));
            System.out.println();





} }}

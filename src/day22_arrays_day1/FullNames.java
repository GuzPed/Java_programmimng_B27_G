package day22_arrays_day1;

import java.util.Arrays;

public class FullNames {
    /*
    Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed
    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]
        JB
        HP
        TS
No loop yet
     */
    public static void main(String[] args) {
        String[] names = {"James Bonds", "Harry Potter", "Tony Stark"};

        System.out.println("" + names[0].charAt(0)+names[0].charAt(names[0].indexOf(' ')+1));
        System.out.println("" + names[1].charAt(0)+names[1].charAt(names[1].indexOf(' ')+1));
        System.out.println("" + names[2].charAt(0)+names[2].charAt(names[2].indexOf(' ')+1));

        System.out.println("===================================================");

        for (String each: names) {
            System.out.println("" + each.charAt(0) + each.charAt(each.indexOf(' ')+1));
        }

        System.out.println("===================================================");

        for (int i = 0; i < names.length; i++) {
            System.out.println("" + names[i].charAt(0) + names[i].charAt(names[i].indexOf(' ')+1));

        }


    }

}

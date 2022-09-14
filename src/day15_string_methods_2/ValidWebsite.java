package day15_string_methods_2;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your website");
        String a = input.next();

        boolean validStart = a.startsWith("www.");
        boolean validEnd = a.endsWith(".com") || a.endsWith(".edu") || a.endsWith(".gov") || a.endsWith(".net");

        if (validStart && validEnd) {
            System.out.println(a + " is valid");
        } else {
            System.out.println(a + " is invalid");
            if (!validStart) {
                System.out.println(" should start with www.");
            }
            if (validEnd){
                System.out.println("should end with .com, .edu, .gov or .net");
            }
        }


    }
}

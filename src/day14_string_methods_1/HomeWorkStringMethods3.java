package day14_string_methods_1;

import java.util.Scanner;

public class HomeWorkStringMethods3 {
    public static void main(String[] args) {
        /*
        Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters
         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your sentence");
        String sentence = input.nextLine();
        String a = sentence.trim();
        System.out.println(a.toLowerCase() + ". The number of characters in your sentence is " + a.length());



    }

}

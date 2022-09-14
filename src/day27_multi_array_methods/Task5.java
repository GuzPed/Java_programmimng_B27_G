package day27_multi_array_methods;


import java.util.Scanner;

public class Task5 {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */
    public static void word(String word){

        for (int i=0; i<word.length();i++) {
            System.out.println(word.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the word");
        word(input.next());
    }

}

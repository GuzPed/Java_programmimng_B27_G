package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    /*
    Separate Parts

Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFGasbn!";
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();

        for (int i=0; i<str.length(); i++) {
            char letter = str.charAt(i);

            if (Character.isDigit(letter)){
                digits.add(letter);
            } else if (Character.isLetter(letter)) {
                letters.add(letter);
            } else {
                specials.add(letter);
            }
       }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specials);


        System.out.println("=============================================================");

        char[] chars = str.toCharArray();

        ArrayList<Character> digitsNew = new ArrayList<>();
        ArrayList<Character> lettersNew = new ArrayList<>();
        ArrayList<Character> specialsNew = new ArrayList<>();

        for (char each: chars) {
            if (Character.isLetter(each)) {
                lettersNew.add(each);
            } else if (Character.isDigit(each)) {
                digitsNew.add(each);
            } else {
                specialsNew.add(each);
            }
        }

        System.out.println("Digits: " + digitsNew + "\nLetters: " + lettersNew + "\nSpecials: " + specialsNew);

    }
}

package day31_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    /*
Create an ArrayList of Characters
Fill the ArrayList with letters of your name. Each letter as a different element
Print each letters on a separate line by accessing each element
     */
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('G', 'u', 'z', 'e', 'l'));

        for (Character each: letters) {
            System.out.println(each);
        }









    }

}

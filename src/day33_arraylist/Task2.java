package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /*
    Remove Countries

Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers

Ex:
Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
Output: "Japan", "Korea", "Turkey", "Canada"
     */
    public static void main(String[] args) {
        ArrayList<String>  words = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));

        System.out.println(countries(words, 7));
    }

    public static ArrayList<String> countries(ArrayList<String> words, int num){
        words.removeIf(p->p.length()>num);
        return words;
    }
}

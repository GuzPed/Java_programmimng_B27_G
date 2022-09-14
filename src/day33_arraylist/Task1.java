package day33_arraylist;

import my_utils.StringUtil;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    /*
    All Palindrome

Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye

     */

    public static void main(String[] args) {

        ArrayList<String> lists = new ArrayList<>(Arrays.asList("Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo", "Eye"));

        lists.removeIf(each-> !each.equalsIgnoreCase(StringUtil.reverse(each)));
        System.out.println(lists);

        //option2
        System.out.println("=======================================");

        ArrayList<String> newList = new ArrayList<>();
        for (String each: lists) {
            String result ="";
            for (int i=each.length()-1; i>=0; i--) {
                result +="" + each.charAt(i);
            }
            if (each.equalsIgnoreCase(result)) {
                newList.add(each);
            }
        }
        System.out.println(newList);
    }







}

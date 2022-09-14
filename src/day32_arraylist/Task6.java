package day32_arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    /*
    Count Letters

Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements

Ex:
Input:
	”java”, ”html”, “css”, “java”, “javascript”, “selenium”
	letter: ‘a’
Output:
	6
     */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        int count = 0;

        for (String each: words) {
            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == 'v') {
                    count++;
                }}}
        System.out.println(count);

        System.out.println("====================================================");

        ArrayList<String> wordsNEW = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        ArrayList<Character> newList = new ArrayList<>();
        for (String each: wordsNEW) {
            char[] arr = each.toCharArray();
            for (char eachArr:arr) {
                newList.add(eachArr);
            }
        }
        System.out.println(Collections.frequency(newList, 'v'));   //Collections.frequency
    }
}

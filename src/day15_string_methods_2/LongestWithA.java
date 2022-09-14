package day15_string_methods_2;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'
	Ex:
		"java"
		"mouse"
		"computer"
	Output: java
Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
        System.out.println("Enter third word");
        String word3 = input.next();
        String character = "&";  //another variable that can be used to check for any character

        String result1 ="";
        String result2 ="";
        String result3 ="";

        if (word1.contains(character)) {
            result1 = word1;}
        if (word2.contains(character)) {
            result2 = word2;}
        if (word3.contains(character)){
            result3 = word3;}

        if (result1.length() >result2.length() && result1.length()>result3.length()) {
            System.out.println("longest word with \"" + character + "\" is " + result1);
        } else if (result2.length() > result1.length() && result2.length() >result3.length()) {
            System.out.println("longest word with \"" + character + "\" is " + result2);
        } else if (result3.length() > result1.length() && result3.length() >result2.length()){
            System.out.println("longest word with \"" + character + "\" is " + result3);
        }




    }
}

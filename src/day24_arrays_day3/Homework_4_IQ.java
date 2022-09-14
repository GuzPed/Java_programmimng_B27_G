package day24_arrays_day3;

import java.util.Arrays;

public class Homework_4_IQ {
    public static void main(String[] args) {
/*
[IQ] Longest Palindrome

	Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
 */
        String[] arr = {"java", "longer word", "apple", "racecar", "mom", "anna"};
        String[] str = new String[arr.length];
        String reversedWord = "";
        String longest = "";

        for (int i = 0; i < arr.length; i++) {
            reversedWord = "";
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                reversedWord += arr[i].charAt(j);
            }
            str[i] = reversedWord;

            if (arr[i].equalsIgnoreCase(str[i]) && arr[i].length() > longest.length()) {
                longest = arr[i];
            }}

        if (longest.isEmpty()) {
            System.out.println("No palindrome");}
        else {
        System.out.println(longest);
    }
}}

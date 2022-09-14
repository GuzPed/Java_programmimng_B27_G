package day24_arrays_day3;

import java.util.Arrays;

public class Homework_6_QI {
    public static void main(String[] args) {
        /*
        Given 2 Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
        Ex. listen
        silent

        the letters of 2 words are the same so the are anagram
         */
        String word1 = "listen";
        String word2 = "silent";

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            System.out.println("it is anagram");
        } else {
            System.out.println("it is NOT anagram");
        }
    }
}

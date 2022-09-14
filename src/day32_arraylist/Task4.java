package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4 {
    /*
    Switch Pairs

Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.

The given ArrayList will always have an even number of elements so each element will always have a single pair.

Ex:
Input: {"Cat", "in", "the", "hat"}

There is two pairs:
"Cat" and "in"
 "the" and "hat"

Output: {"in", "Cat", "hat", "the”}
     */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat", "mama", "papa"));

        if (words.size() % 2 ==0 ){
            for (int i=0; i< words.size(); i=i+2){
                Collections.swap(words, i,i+1);
            }
            System.out.println(words);

        } else {
            System.out.println("ArrayList should always have an even number of elements, otherwise Switch will not work");
        }


        System.out.println("=================================================");

        ArrayList<String> wordsNew = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat", "mama", "papa"));
            for (int i = 0; i < wordsNew.size(); i = i + 2) {
                String temp = wordsNew.get(i);
                wordsNew.set(i, wordsNew.get(i+1));
                wordsNew.set(i+1, temp);

            }
            System.out.println(wordsNew);













        }




}

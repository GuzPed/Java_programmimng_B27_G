package day31_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
      Practice flow:
Create an ArrayList of Strings
add these elements:
  Iron Man, Spider Man, Thor, Captain America, Hawkeye
  remove Thor by index
  remove Iron Man by element
  remove the first index
Print the ArrayList after each action to see how the change is made
       */
public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Iron Man", "Spider Man", "Thor", "Captain America", "Hawkeye"));
        System.out.println(words);

        words.remove(words.indexOf("Thor"));
        System.out.println(words);

        words.remove("Iron Man");
        System.out.println(words);

        words.remove(0);
        System.out.println(words);





    }
}

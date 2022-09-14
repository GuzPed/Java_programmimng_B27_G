package day31_arraylist;

import java.util.ArrayList;

public class AddMethods {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();  // creates an empty Arraylist
        System.out.println(letters.size()); // 0 -> empty
        letters.add('j');
        letters.add('a');
        letters.add('c');
        letters.add('a');
        System.out.println(letters.size()); //number of elements - 4
        System.out.println(letters);  //[j,a,c,a]

        System.out.println(letters.get(0));
        System.out.println(letters.get(2));

        letters.add(0,'&');
        letters.add(3, '8');
        System.out.println(letters);




    }



}

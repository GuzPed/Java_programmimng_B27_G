package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    public static ArrayList<String> switchPairs(ArrayList<String> list) {

        for (int i=0; i<list.size(); i+=2) {
          //  System.out.println("pairs: " + list.get(i) + " & " + list.get(i+1));
            String temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);
         //   System.out.println("pairs changed: " + list.get(i) + " & " + list.get(i+1));

        }

        return list;
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat", "mama", "papa"));
        System.out.println(list);
        System.out.println(switchPairs(list));

    }
}

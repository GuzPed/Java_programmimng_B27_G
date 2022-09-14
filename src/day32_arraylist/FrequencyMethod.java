package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyMethod {
    public static void main(String[] args) {

        ArrayList<Character> strs = new ArrayList<> (Arrays.asList('a', 'b', 'd', 'e', 'g', 'e', 's', 'e', 's', 'd'));
        System.out.println(Collections.frequency(strs, 'e'));
        System.out.println(Collections.frequency(strs, 'a'));
        System.out.println(Collections.frequency(strs, 's'));


        // Gizen a String determine how many times the letter 'a' is in the string
String s = "aabbdfdaaadfrlkdsaaasdasfdsa";
                            //convert to ArrayList       // convert to Array, split by ""
ArrayList<String> list =  new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);
        System.out.println(Collections.frequency(list, "a"));

    }
}

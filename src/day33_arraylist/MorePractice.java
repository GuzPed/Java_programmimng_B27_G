package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MorePractice {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Guzel", "Pedro", "Genti", "Beyza", "Kai", "Deniz", "Maria", "Nurzia", "Makhmut"));
        ArrayList<String> byLength = new ArrayList<>(names);
        byLength.removeIf(name -> name.length() > 5);
        System.out.println(byLength);

        ArrayList<String> byFirstLetter = new ArrayList<>(names);
        byFirstLetter.removeIf(p -> p.startsWith("B") || p.startsWith("G"));
        System.out.println(byFirstLetter);

        ArrayList<String> byLastLetter = new ArrayList<>(names);
        byLastLetter.removeIf(l-> !l.endsWith("i"));
        System.out.println(byLastLetter);

        System.out.println("===============================================================");

//        for (String each: names){
//            System.out.println(names);
//        }


        names.forEach(each-> System.out.println(each));  // print every element from the list

        names.forEach(name-> System.out.println(name.charAt(0) + " " + name.charAt(name.length()-1)));




    }
}

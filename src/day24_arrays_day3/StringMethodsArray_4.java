package day24_arrays_day3;

import java.util.Arrays;

public class StringMethodsArray_4 {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] letters = s.toCharArray();
        System.out.println(letters);// string uses array internally, so it prints as String
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(letters.length); //counts number of elements
        System.out.println(s.length()); // counts number of characters


        for (char eachLetter: s.toCharArray()) {
            System.out.println(eachLetter);
        }

        System.out.println();

        String str = "monday,tuesday,wednesday,thurday,friday,saturday,sunday";
        System.out.println(Arrays.toString (str.split(",")));

        for (String eachDay:str.split(",")) {
            System.out.println(eachDay);
        }


        String str2 = "Jan-Feb-Mar-May-Apr-Jun-Jul-Aug";
        String[] months = str2.split("-");
        System.out.println(Arrays.toString(months));

        for (String eachMonth: months) {
            System.out.println(eachMonth);
        }


        System.out.println();
        String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));

        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray()));  // char[] array back
        System.out.println(Arrays.toString(str4.split(""))); // string []  array back


    }
}

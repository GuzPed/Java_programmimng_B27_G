package day25_arrays_day4;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        String[] words = {"hello", "monday", "java", "world"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join("#", words));
        System.out.println(String.join("    ", words));
        System.out.println(String.join(" MIDDLE ", words));

        int[] aa= new int[] {1,5,2,5}; //another syntax to create an array
        // normally used when you don't need a reference

        System.out.println(Arrays.toString(new int[] {1,5,9,4})); // creates array, prints, does not have a reference to use it after in the program



    }
}

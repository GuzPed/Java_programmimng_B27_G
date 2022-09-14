package day23_arrays_day2;

import java.util.Arrays;

public class ReplitReverse {
    public static void main(String[] args) {

        String[] arr = {"hello", "why", "by", "apple", "note"};
        String[] reversed1 = new String [arr.length];
        for (int i=arr.length-1; i>=0; i--) {      //5

            reversed1[(reversed1.length-1)-i] = arr[i];


        }
        System.out.println(Arrays.toString(reversed1));


    }
}

package day31_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    /*
    Try to loop:

Create an ArrayList of Double elements
Fill the ArrayList with some values
Find the max element from the ArrayList
     */
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<>(Arrays.asList(15.58, 25.23, 25.94, 99.35, 5.64));

        double max = nums.get(0);
        for (Double each: nums) {
            if (each>max) {
                max=each;
            }
        }
        System.out.println(max);




    }



}

package day25_arrays_day4;

import java.util.Arrays;

public class MultiIdea {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = {7,8,9};

        int[][] all= {a,b,c}; // create a 2d array
        // what are the elements for all array: 1d array(normal array)

        System.out.println(Arrays.toString(all[0]));
        System.out.println(Arrays.toString(all[1]));
        System.out.println(Arrays.toString(all[2]));

        System.out.println("First element in each array") ;
        System.out.println(all[0][0]);
        System.out.println(all[1][0]);
        System.out.println(all[2][0]);

        System.out.println("last elements");
        System.out.println(all[0][all.length-1]);
        System.out.println(all[1][all.length-1]);
        System.out.println(all[2][all.length-1]);



    }
}

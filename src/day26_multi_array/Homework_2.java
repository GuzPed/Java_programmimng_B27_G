package day26_multi_array;

import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        /*
        Given a 2D int array merge the elements into one 1D array
Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
       Output:
              [ 10, 20, 30, 5, 10, 15 ]
         */

        int [][] nums = {
                {10, 20, 30},
                {5, 10, 15}
        };

        int quantityOfElem = 0;
        for (int[] eachOutter : nums) {
            for (int eachInner : eachOutter) {
                quantityOfElem++;
            }
        }
        System.out.println(quantityOfElem);


        int[] a = new int[quantityOfElem];

        int y = 0;
        for (int[] eachOutter : nums) {
            for (int eachInner : eachOutter) {
                a[y++] = eachInner;}
       //     System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));




    }
}

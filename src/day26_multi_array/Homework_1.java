package day26_multi_array;

import java.util.Arrays;

public class Homework_1 {
    /*
    Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

Extra: Find the max and min between each inner array
     */
    public static void main(String[] args) {

        int[][] nums = {
                {41, 5, 2, 23},
                {-12, 1, -5, -2},
                {1, 5, 1, 5}
        };

        int maxOuter= nums[0][0];
        int minOuter = nums[0][0];


        for (int i=0; i < nums.length; i++) {
            int max=nums[0][0];;
            int min = nums[0][0];

            for (int j=0; j< nums[i].length; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
                if (nums[i][j] < min) {
                    min = nums[i][j];
                }
              }
            System.out.println((i+1) + " array");
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println();

            if (max > maxOuter) {
                maxOuter=max;
            }
           if (min < minOuter) {
               minOuter = min;
            }


        }
        System.out.println("Max between max: " + maxOuter);
        System.out.println("Min between min: " + minOuter);


    }
}

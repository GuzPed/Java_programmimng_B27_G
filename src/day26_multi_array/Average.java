package day26_multi_array;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        /*
        1) see the average of each array
        2) total average of all numbers
         */
        int totalSum =0;
        int totalElements = 0;

        int[][] nums= {
                {3,5,1,2},
                {2,1,5,10,8},
                {3,1,5,12}
        };

        for(int[] eachInner :nums) { //for looping through the 2D array nums, which means going through each inner array (int[])
            int sum=0; // resets for the next array
            for (int each: eachInner) { // purpose of inner loop :to add all the numbers from the inner array
                sum +=each;
            }
            System.out.println(Arrays.toString(eachInner));
            System.out.println("avarage " + (double)sum/eachInner.length);

            totalSum+=sum;
            totalElements+=eachInner.length;


        }
        System.out.println("total average of num"  + (double)totalSum/totalElements);

    }


}

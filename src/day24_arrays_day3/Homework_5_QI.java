package day24_arrays_day3;

import java.util.Arrays;

public class Homework_5_QI {
    public static void main(String[] args) {
     /*
[IQ] Second Biggest Number

Given an Array of numbers. Find and print the 2nd biggest number.

Note the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:
		5
      */


        int[] arr = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8, 9, 10};
        int biggestUnique =0;

        Arrays.sort(arr);                                                              //sort from smallest to biggest
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i<arr.length-1; i++) {                                                  //starts from second element, because the first one is the smallest
            if (arr[i-1]!=arr[i] && arr[i]!=arr[i+1] && arr[i]>biggestUnique) {               // checks in second number is not equal to first one and third one. i do not check the last number, because it is the largest number. and check for biggest unique number in the if statement
                biggestUnique = arr[i];
            }
        }
       System.out.println(biggestUnique);


    }
}

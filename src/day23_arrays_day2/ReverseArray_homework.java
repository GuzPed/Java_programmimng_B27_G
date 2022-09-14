package day23_arrays_day2;

import java.util.Arrays;

public class ReverseArray_homework {
    public static void main(String[] args) {
        /*
        Reverse Array
	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
         */

        int[] arr = {1,2,3,4,5};
        int[] newArr = new int[arr.length];

        for (int i=arr.length-1; i>=0;i--) {
            newArr[(newArr.length-1)-i] = arr[i];

        }
        System.out.println(Arrays.toString(newArr));
    }
}

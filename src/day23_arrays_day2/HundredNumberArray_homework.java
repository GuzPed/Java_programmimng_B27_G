package day23_arrays_day2;

import java.util.Arrays;

public class HundredNumberArray_homework {
    public static void main(String[] args) {
/*
100 number array

	1. Create an int array called numbers that has length of 100
	2. Assign 1-100 to each index of the array. Then print your number array
 */

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

        }
        System.out.print(Arrays.toString(numbers));


    }
}

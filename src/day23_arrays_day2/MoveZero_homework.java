package day23_arrays_day2;

import java.util.Arrays;

public class MoveZero_homework {
    public static void main(String[] args) {
        /*
        Move Zeros

	Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position

Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes

	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]
         */

        int[] numbers = {10, 0, 5, 0, 1, 0};
        int[] nums = new int[numbers.length];
        int j = nums.length-1;
        int a=0;

        for (int i=0; i< numbers.length;i++) {
            if (numbers[i] !=0) {
                nums[a] = numbers[i];
                a++;
            } else if (numbers[i] ==0){
                nums[j]=numbers[i];
                j--;
            }

        }
        System.out.println(Arrays.toString(nums));

        System.out.println("====================================================");


        int[] numsss = new int[numbers.length];
        int b=0;

        for (int i=0; i< numbers.length;i++) {
            if (numbers[i] != 0) {
                numsss[b] = numbers[i];
                b++;
            }
        }System.out.println(Arrays.toString(numsss));




    }

}

package day24_arrays_day3;

import java.util.Arrays;

public class MoveZeros_2 {
    public static void main(String[] args) {
        int[] nums = {10,0,5,0,1,0};
        int indexToRead =0;  // read every element from the beginning to end --> same as a traditional loop
        int[] fixed = new int[nums.length];  // [0,0,0,0,0,0,]
        int indexToStore=0; // store values into the fixed array, maybe will not increment each time

        // indexToRead: 0
        // indexToStore: 0

        while(indexToRead < nums.length) {
            if (nums[indexToRead] != 0) {
                fixed[indexToStore++] = nums[indexToRead];
                //indexToStore++;


            }
            indexToRead++;
        }

        System.out.println(Arrays.toString(fixed));

    }

}

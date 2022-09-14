package homework_practice.arrays;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] nums = {{10,20,30}, {5,10,15}};
        int count=0;

        for(int[] each: nums) {
            for(int eahcIn: each){
            count++;
        }}


        int[] nums2 = new int[count];
        int i=0;

        for(int[] each: nums) {
            for(int eahcIn: each){
                nums2[i++] = eahcIn;
            }}

        System.out.println(Arrays.toString(nums2));



    }
}

package day23_arrays_day2;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[][] nums = {
                {10, 20, 30},
                {5, 10, 15}
        };

        int[] arr2=new int[0];
        int count=0;
        for (int[] eachRow : nums) {
            for (int eachColumn : eachRow) {
                arr2= Arrays.copyOf(arr2,count+1);
                arr2[count]=eachColumn;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr2));
            }
        }


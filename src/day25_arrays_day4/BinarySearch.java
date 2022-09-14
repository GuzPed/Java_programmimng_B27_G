package day25_arrays_day4;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6,23,100,240,2000};
        System.out.println(Arrays.binarySearch(arr, 240)); //3
        System.out.println(Arrays.binarySearch(arr, 2000));//4
        System.out.println(Arrays.binarySearch(arr, 6));//0
        System.out.println(Arrays.binarySearch(arr, 25));//-3 it is should be in 2 index +1
        System.out.println(Arrays.binarySearch(arr, 500));///5 - it should be in4 position +1

        System.out.println();

        int[] b = {6,2,-1,4,20,-14};
        System.out.println(Arrays.binarySearch(b, 4)); //3
        System.out.println(Arrays.binarySearch(b, 6)); //-5
        System.out.println(Arrays.binarySearch(b, -14)); //-1

        // binary search method does not work if array is not sorted
        System.out.println();

        Arrays.sort(b);
        System.out.println(Arrays.toString(b)); //-1
        System.out.println(Arrays.binarySearch(b, 4)); //3
        System.out.println(Arrays.binarySearch(b, 6)); //4
        System.out.println(Arrays.binarySearch(b, -14)); //0
        System.out.println(Arrays.binarySearch(b, 0)); //-3

        System.out.println();

        String[] words = {"hello", "world", "zebra", "water"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); //
        System.out.println(Arrays.binarySearch(words, "hello")); //0
        System.out.println(Arrays.binarySearch(words, "zebra")); //3
        System.out.println(Arrays.binarySearch(words, "mama")); //-2
        System.out.println(Arrays.binarySearch(words, "World")); //-1


    }
}

package day28_methods;

import java.util.Arrays;

public class Task9 {
    /*
    Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */
    public static void main(String[] args) {
        System.out.println("the number is in the array  - " + contains(new int[]{15, 50, -2, 58, 155, -25}, 45));

    }

    public static boolean contains(int[] arr, int number) {

        Arrays.sort(arr);
        int indexOfGivenNum = Arrays.binarySearch(arr, number);

        boolean contains= indexOfGivenNum > 0;
        return contains;
            }


}

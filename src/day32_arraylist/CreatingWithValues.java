package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValues {
    public static void main(String[] args) {
        //conver array to ArrayList

        int [] arr = {3,5,1,1};
        Arrays.asList(arr); // converts Array to ArrayList

        //create an ArrayList with initial values
        Integer[] arr2 = {3,4,8,5};
        ArrayList<Integer>  nums = new ArrayList<>(Arrays.asList(arr2)); // arr is not valid, because it is primitive array

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,7,8,8));
        System.out.println(list);






    }
}

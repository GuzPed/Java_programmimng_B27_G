package day23_arrays_day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LoopArray_2 {
    public static void main(String[] args) {
        int[] num = {4,213,6};

        Arrays.toString(num);
        // print the whole array
        System.out.println(Arrays.toString(num));

        System.out.println("=========================================");
        //print each on a separate line hard coded index
        System.out.println("Hardcoded: ");
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        System.out.println("=========================================");
        //printing each with for loop
        System.out.println("With for loop: ");
        for (int i=0; i> num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("=========================================");
        //create our own printing format:
        System.out.println("Our own formar: ");
        String arrayAsString = "Array ~ ";
        for (int i =0; i< num.length; i++) {
            arrayAsString += num[i] + " | ";
        }
        arrayAsString += " ~";
        System.out.println(arrayAsString);

        System.out.println("=========================================");
        //go through with for each loop
        System.out.println("For each loop: ");
        for (int each: num) {
            System.out.println(each);  // each == num[i] - are the same
        }






    }
}

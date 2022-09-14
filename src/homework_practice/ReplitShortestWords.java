package homework_practice;

import java.util.Arrays;

public class ReplitShortestWords {
    public static void main(String[] args) {
        String str= "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] arr = str.split(", ");
        System.out.println(Arrays.toString(arr));
        String smallWords="";


        String smallest = arr[0];

        for (int i=1; i<arr.length; i++) {
            if ((arr[i].length() <= smallest.length())) {
                smallest = arr[i];
            }
            smallWords+= smallest + " ";

        }

        System.out.println(smallWords);


    }
}

package day22_arrays_day1;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {
        int [] nums= {4,5,12};
        System.out.println("how many elements "  + nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]);  // addition int+int

        String[] strs = {"Hello", "World", "Java", "code"} ;
        System.out.println(strs.length);  // how many elements
        System.out.println(strs[2]);
        System.out.println(strs[2] + strs[3]); //concatenation of String and string
        System.out.println(strs[2].length()); // String method length() -  the number of characters in the String

        System.out.println(strs[1].charAt(strs[1].length()-1)); // last index of the element at index 1
        String s = strs[3]; // reassigning the value of the 3rd index of array in to a nes Sring variable  s





    }

}

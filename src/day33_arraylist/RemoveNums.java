package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<> (Arrays.asList(1,5,2,8,7,5,6,4,2,8,6,3,10,0,2,3,7,5,9,7));

        // remove all the numbers that are less than 5

        for (int i = 0; i<nums.size(); i++) {
            if (nums.get(i) <5) {
                nums.remove(i);
                i--;
            }
        }
        System.out.println(nums);

        System.out.println("=======================================================");

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,8,9,3,4,2,4,3,4,6,4,3,9,8,2,4,1));
        nums2.removeIf(n-> n<5 )  ; // n will be every element
        System.out.println(nums2);




    }
}

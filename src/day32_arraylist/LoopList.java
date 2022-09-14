package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,8,7,3,4));

        for (int i=0; i <nums.size(); i++) {
            System.out.print(nums.get(i)+" ");
        }

        for(Integer each: nums) {
            System.out.print(each+" ");
        }
        System.out.println("==================================");

        ArrayList<String> word = new ArrayList<>(Arrays.asList("Iron Man", "Spider Man", "Thor", "Captain America", "Hawkeye"));
        for(String each: word) {
            if (each.contains(" ")) {
                System.out.println(each.substring(0,1)+ each.substring(each.indexOf(" ")+1,each.indexOf(" ")+2));
            } else {
                System.out.println(each.charAt(0));
            }
        }



    }
}

package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SumString {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("123","34", "513"));
        System.out.println(sumDigits(str));
    }


    public static ArrayList<Integer> sumDigits(ArrayList<String> list) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (String each: list) {
            int sum = 0;
            for (String eachDigit: each.split("")) {
            sum+=Integer.parseInt(eachDigit);

        }
            nums.add(sum);

    }
        return nums;
}}

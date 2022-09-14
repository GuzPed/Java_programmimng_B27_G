package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3 {
    /*
    Remove Duplicates

Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.

@param nums - The given ArrayList of numbers
@return - ArrayList of numbers


Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};

     */

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));

        System.out.println(removeDuplicate(nums));
        System.out.println(removeDuplicate3(nums));
        System.out.println(removeDuplicate4(nums));
    }

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> nums){
        ArrayList<Integer> newMuns = new ArrayList<>();

        for (Integer each: nums) {
            int count =0;
            for (Integer eachInner: nums) {
                if (each==eachInner) {
                    count++;
                }}
            if (count==1) {
                newMuns.add(each);
            }}
        return newMuns;
    }


    public static ArrayList<Integer> removeDuplicate2(ArrayList<Integer> nums) {

        for (int i=0; i<nums.size();i++) {
            for (int j=i+1; j<nums.size();j++) {
                if (nums.get(i)==nums.get(j)) {
                    nums.remove(nums.get(i));
                   nums.remove(nums.get(j));
                   j--;
                }
            }
        }
        return nums;
    }

    public static ArrayList<Integer> removeDuplicate3(ArrayList<Integer> nums) {
        ArrayList<Integer> newMuns2 = new ArrayList<>();
        for (int i=0; i<nums.size();i++) {
            int count = Collections.frequency(nums, nums.get(i));
            if (count==1) {
                newMuns2.add(nums.get(i));
            }
        }
        return newMuns2;
    }

    public static ArrayList<Integer> removeDuplicate4 (ArrayList<Integer> nums){
        ArrayList<Integer> unique = new ArrayList<>(nums);
        unique.removeIf(each -> Collections.frequency(nums,each) > 1);
        return unique;
    }





}




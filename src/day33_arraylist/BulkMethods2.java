package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,22,8,1,9,7,6,463,15));
        System.out.println("contains 4 " + nums.contains(4));
        System.out.println("contains 4 & 5 " + (nums.contains(4) && nums.contains(5)));
        System.out.println("checking with containsAll " + nums.containsAll(Arrays.asList(4,3,5,1)));
        System.out.println("checking with containsAll " + nums.containsAll(Arrays.asList(4,8,7,1)));

        nums.retainAll(Arrays.asList(463,22,9));
        System.out.println(nums);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('m', 'g', 'd', 'w', 'a', 'a', 'd'));
        letters.retainAll(Arrays.asList('a', 'd'));
        System.out.println(letters);

        String s = "implementation";
        ArrayList<String>  lists = new ArrayList<>(Arrays.asList(s.toLowerCase().split(""))); //converst the string to ArrayList where each character a different element
        lists.retainAll(Arrays.asList("a", "e", "i", "o", "u"));
        System.out.println(lists.size());
        System.out.println(lists);




    }


}

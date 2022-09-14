package day33_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {

        ArrayList<Integer>  nums = new ArrayList<>();
        nums.add(4);

        ArrayList<Integer> other = new ArrayList<> (Arrays.asList(6,1,5,12224));
        nums.addAll(other);
        System.out.println(nums);

        nums.addAll(Arrays.asList(9,2,6,35));
        System.out.println(nums);

        nums.addAll(0, Arrays.asList(4,5,3,1,125));
        System.out.println(nums);

        nums.removeAll(Arrays.asList(1));
        System.out.println(nums);

        nums.removeAll(Arrays.asList(4,5,6));
        System.out.println(nums);

        ArrayList<String>  word = new ArrayList<>();
        word.addAll(Arrays.asList("one" ,  "two", "Three", "One"));
        System.out.println(word);
        word.remove(Arrays.asList("one"));
        System.out.println(word);


    }
}

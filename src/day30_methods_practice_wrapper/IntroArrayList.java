package day30_methods_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {
        int[] a= {4,2,1};
        System.out.println("number of Elements: " + a.length);
        System.out.println("print the whole array " + Arrays.toString(a));
        System.out.println("acces the first element: " + a[0]);
        System.out.println("Add elements to the array: CANNOT change the size after creation"  );
        System.out.println("remove elements from the array: - CANNOT");
        System.out.println("Array can hold values that are primitives types or object types");

        System.out.println("===================================================");

        ArrayList<Integer> nums= new ArrayList<>();// empty ArrayList
        System.out.println("Number of Elements: " + nums.size());
        System.out.println("print the whole ArrayList " + nums);
        System.out.println("acces the first element:     .add()  method" );


        nums.add(5);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.size());



    }
}

package day29_methods;
import my_utils.ArrayUtil;

import java.util.Arrays;

public class CallingArrayMethods {
    public static void main(String[] args) {
        int[] arr = {1,56,8,3,-15,-2,0,56,3};
        String[] str = {"mama", "papa", "me", "you", "mama"};
        String[] str2 = {"today", "is", "monday"};
        System.out.println(" min: " + ArrayUtil.minNumber(arr));

        System.out.println("max: " + ArrayUtil.maxNumber(arr));

        System.out.println("contains the number? " + ArrayUtil.
                doesContain(arr, 7));

        System.out.println(" index of number: " + ArrayUtil.indexOf(arr, 56));

        System.out.println(ArrayUtil.indexOfString(str, "mama"));

        System.out.println(Arrays.toString(ArrayUtil.addElement(str, "Guzel")));

        System.out.println(Arrays.toString(ArrayUtil.twoArraysIntoOne(str, str2)));

        String[] miltiAdded = ArrayUtil.twoArraysIntoOne(str, str2);
        System.out.println(Arrays.toString(miltiAdded));



        System.out.println(ArrayUtil.minNumber(4,2,5,3,7,8,5,4));

        System.out.println(ArrayUtil.maxNumber(4,2,5,3,7,8,5,4));

        System.out.println(ArrayUtil.maxNumber(new int [] {4,2,5,3,7,8,5,4,3}));

        System.out.println("index of 3 -" + ArrayUtil.indexOf(arr, 3));
        System.out.println("index of 3 -" + ArrayUtil.indexOf(arr, 3, 5));

        //OR
        int firstIndex = ArrayUtil.indexOf(arr, 3);
        int secondIndex = ArrayUtil.indexOf(arr,3, firstIndex+1);



    }

}

package my_utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
    /*
    Min Number
create a method that will accept an int array and return the smallest number from the array
     */
 public static int minNumber (int ... arr) {
     int min=arr[0];
     for (int each: arr) {
         if (each< min) {
             min=each;
         }
     }
     return min;
 }
/*
Max Number
Create a method that will accept an int array and return the biggest number from the array
 */
    public static int maxNumber (int ... arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
/*
Contains
create a method that will accept an int array and an int number. Check and return if the given number is in the array.
 */
    //first way
public static boolean doesContain(int[] arr, int number) {
    return indexOf( arr, number) >=0;
}

    //second way/methods
public static boolean contains(int [] arr, int num) {

    for (int each: arr) {
        if (each==num){
            return true;
        }}
    return false;
}


/*
IndexOf
create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index
 */

   // public static int indexOfNumber(int num, int ... arr) {  - if you wanted to use var args
    public static int indexOf(int[] arr, int number) {

        for (int i=0; i< arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] arr, int target, int startIndex) {  // overloaded use

        for (int i=startIndex; i< arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    /*
    IndexOf
overload the indexOf method to work with String array and String element
     */


    public static String indexOfString(String[] str, String word) {
        String index = "";
        for (int i=0; i< str.length; i++) {
            if (str[i].equalsIgnoreCase(word)) {
                index += " " +i;
        }
    }
        return index;

}
/*
Add Element
create a method that will accept a String array and a String element. Add the given element value into the end of the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one
 */

    public static String[] addElement(String[] str, String word) {
        String[] newStr = Arrays.copyOf(str,str.length+1);
        newStr[newStr.length-1] = word;
        return newStr;
    }

    public static String[] addNewElement (String [] arr, String element) {
        String [] newArr = new String[arr.length+1];
        for (int i=0; i<arr.length; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1] = element;
        return newArr;
    }

    /*
    Add Element
overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the the first array.
Ex:
	{"today", "is", "monday"}
	{"no", "softskills", "today"}
output > [today, is, monday, no, softskills, today]
     */

    public static String[] twoArraysIntoOne(String[] str, String[] str2) {
        String[] newStr = new String[str.length + str2.length];

        for (int i=0; i< newStr.length; i++) {
            if (i< str.length) {
                newStr[i] = str[i];
            } else {
                newStr[i] = str2 [i- str.length];
            }
        }
return newStr;

    }



}

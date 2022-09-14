package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    /*
    String Sum

Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("123","34", "513"));
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String each : str) {
            String[] list = each.split("");
            int sum=0;
            for (String eachLetter: list) {
                int num = Integer.parseInt(eachLetter);
                sum+=num;
            }
            numbers.add(sum);
        }
        System.out.println(numbers);


        System.out.println("======================================================");

        ArrayList<String> strNEW = new ArrayList<>(Arrays.asList("123","34", "513"));
        ArrayList<Integer> numbersNew = new ArrayList<>();

        for (String each : str) {
            int size = each.length();
            int num = Integer.parseInt(each);
            int sum=0;
            for (int i=0; i<size; i++) {
                int n1 = num%10;
                sum+=n1;
                num=num/10;

            }
            numbersNew.add(sum);
        }
        System.out.println(numbersNew);



















    }
}

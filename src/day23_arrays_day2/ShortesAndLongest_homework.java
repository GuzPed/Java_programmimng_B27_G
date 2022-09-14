package day23_arrays_day2;

public class ShortesAndLongest_homework {
    /*
    Shortest and Longest words from String array

	• Write a program that can return the shortest string element from a String array
	• Write a program that can return the longest string element from a String array

Hint: a good default value is the first element
     */
    public static void main(String[] args) {



        String[] arr = {"hello", "why", "by", "applebees", "note"};
        String longest = "";
        String shortest = arr[0];

        for (int i=0; i< arr.length;i++) {
            if (arr[i].length() >longest.length()) {
                longest = arr[i];
            }
            if (arr[i].length() < shortest.length()) {
                shortest=arr[i];
            }



        }
        System.out.println(longest);
        System.out.println(shortest);




    }
}

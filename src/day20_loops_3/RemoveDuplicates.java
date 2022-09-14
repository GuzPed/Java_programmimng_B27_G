package day20_loops_3;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc
         */

        String str = "cbcvcbfabcdfgdfgmhabc";
        String output = "";

        for (int i = 1; i< str.length(); i++) {
            String a = str.substring(0,i);
            String b= str.substring(i);

            if (b.contains(a)) {
                output = str.replaceFirst(a, "");
            }

        }
        System.out.println(output);

        System.out.println("------------------------------------");

       /* for (int i = 0; i< str.length(); i++) {
            String a = str.substring(i,i+1);
            String b= str.substring(i+1);

            if (b.contains(a)) {
                output = str.replaceFirst(a, "");
            }

        }
        System.out.println(output);*/




    }
}

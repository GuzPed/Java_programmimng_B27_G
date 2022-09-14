package day22_arrays_day1;

import java.util.Arrays;

public class GentiExersice {
    /*
    /*
    Given an array of String reverse array and every string of each position without using another array or or another variable as container.
before
    dayOfWeek = {"Monday", "Tuesday", "Wednesday"};
after
    dayOfWeek = {"YADSENDEW" , " YADSEUT", " YADNOM"};

     */
    public static void main(String[] args) {
      /*  String reverseWord1="";
        String reverseWord2="";
        String reverseWord3="";
        String result ="";

      String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday"};

      /* for (int i=dayOfWeek[0].length()-1; i>=0; i--) {
             reverseWord1 += dayOfWeek[0].charAt(i);
        }
        for (int i=dayOfWeek[1].length()-1; i>=0; i--) {
             reverseWord2 += dayOfWeek[1].charAt(i);
        }
        for (int i=dayOfWeek[2].length()-1; i>=0; i--) {
             reverseWord3 += dayOfWeek[2].charAt(i);
        }


    String[] dayOfWeek1 = {reverseWord1, reverseWord2, reverseWord3};
        for (int i=dayOfWeek1.length-1; i>=0; i--) {
        System.out.print(dayOfWeek1[i] + " ");
        }

*/


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday"};

        for (int i=dayOfWeek.length-1; i>=0; i--) {               //reverse array
            String reverseWord ="";

            for (int j = dayOfWeek[i].length() - 1; j >= 0; j--) {   // reverse each word in array
                reverseWord +=" "+ dayOfWeek[i].charAt(j);
                }

            System.out.print(reverseWord.toUpperCase() + " ");

            }








        }







    }






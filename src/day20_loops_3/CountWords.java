package day20_loops_3;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*
        Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
         */
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().trim();
        int count = 1;

        for (int i=0; i<str.length(); i++) {
            char letter =str.charAt(i);
            if (letter == ' ') {  // but what if "I love you!" it will count 4 words as well as !
                count++;

            }

        }
        System.out.println(count);

        System.out.println("-------------------------------------------------");

     /*   for (int i=0; i<str.length(); i++) {
            char letter =str.charAt(i);
            if (letter == ' ' && str.charAt(i+1)) {
                count++;

            }

        }
        System.out.println(count);*/








    }
}

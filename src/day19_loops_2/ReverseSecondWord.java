package day19_loops_2;

public class ReverseSecondWord {
    public static void main(String[] args) {
        /*        Reverse only second word
Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java
	Ouput:
	I evol java
         */

        String nnn = "I love you";
        int length = nnn.length();
        int indexOfSpace = nnn.indexOf(" ");
        int lastIndexOfSpace = nnn.lastIndexOf(" ");
        String reverseWord = nnn.substring(indexOfSpace+1,lastIndexOfSpace );
        int lengthReversed = reverseWord.length();
        String ccc = "";



        for  (int num = lengthReversed; num > 0; num--) {
             ccc += reverseWord.charAt(num-1) + "";
       }
        System.out.print(nnn.substring(0,indexOfSpace+1) + ccc + nnn.substring(lastIndexOfSpace));


    }
}

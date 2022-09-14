package day25_arrays_day4;

import java.util.Arrays;

public class Anagram_2 {
    public static void main(String[] args) {

//        String word1 = "listenbd";
//        String word2 = "silenteh";
//        String ddd = "";

        String wordOne = "listen";
        String wordTwo = "silent";
        int counter = 0;
        String letter = "";

        for (int i = 0; i < wordOne.length(); i++){
            letter += wordOne.charAt(i);

            if(wordOne.length() == wordTwo.length()) {
                if (wordTwo.contains(letter)) {
                    counter++;
                }// end of inner if statement
            } // end of outer if statement
            letter = "";
        } // end of for loop
        System.out.println(counter == wordTwo.length() ? "Anagram" : "Not anagram");


//        char[] arr1 = word1.toCharArray();
//        char[] arr2 = word2.toCharArray();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//        if (arr1.length == arr2.length) {
//
//            for (int i = 0; i < arr1.length; i++) {
//                int count = 0;
//
//                for (int j = 0; j < arr2.length; j++) {
//                    if (arr1[i] == arr2[j]) {
//                        count++;
//                        break;
//                    }
//                }
//                if (count==1 && count!=0) {
//                    ddd="anagram";
//                } else {
//                    ddd="not anagram";
//                }
//            }
//            System.out.println(ddd);
//        } else {
//            System.out.println("not anagram");
//        }

    }
    }


package day16_string_methods_3;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        /*[Remove first and last]
Given two words. Print the first word without its first character then print the second word without its last character.
    Input:
        apple
        banana
    Output:
        pple
        banan
         */
        String firstWord = "apple";
        String secondWord = "banana";

        System.out.println(firstWord.substring(1));
        System.out.println(secondWord.substring(0, secondWord.length() - 1));
    }
}

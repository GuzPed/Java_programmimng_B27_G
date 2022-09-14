package day16_string_methods_3;

public class LongestA {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        int word1lenth = word1.length();
        int word2lenth = word2.length();
        int word3lenth = word3.length();
        String longest = "";


        if (word1.contains("a") && word1lenth> longest.length()) {
            longest = word1;
        }
        if (word2.contains("a") && word2lenth > word1lenth) {
            longest = word2;
        }
        if (word3.contains("a") && word3lenth > word1lenth) {
            longest = word3;
        }
        System.out.println(longest + " is the longest with a");

    }
}

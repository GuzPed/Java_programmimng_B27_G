package homework_practice.arrays;

public class Task5 {
    public static void main(String[] args) {
        /*
        [IQ] Longest Palindrome

	Given a String array. Find the longest Palindrome String in your array.

		Ex:
		Input:
			["java", "longer word", "civic", "apple", "racecar", "mom", "anna"]
		Output: racecar

		Ex:
		Input: ["abc", "dna", "kevin", "joe", "lamp"]
		Output: No palindrome
         */

        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longest ="";

        String[] str = new String[words.length];

        for (int i = 0; i<words.length; i++) {
            String reverse = "";
            for (int j =words[i].length()-1; j>0; j-- ) {
                reverse +=words[i].charAt(j);
            }
            str[i] = reverse;

            if (words[i].equalsIgnoreCase(str[i]) && words[i].length()>longest.length() ) {
                longest = words[i];
            }
        }

        if (longest.isEmpty()) {
            System.out.println("no palidrome");
        } else {
            System.out.println(longest);
        }




    }
}

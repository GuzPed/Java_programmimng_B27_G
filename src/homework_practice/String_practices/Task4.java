package homework_practice.String_practices;

public class Task4 {
    public static void main(String[] args) {
        String a = "java";
        String b = "mouse";
        String c = "computeraaaaa";
        String longest = "";
        String letter = "a";

        if (a.contains(letter) && a.length()>longest.length()) {
            longest = a;
        }

        if (b.contains(letter) && b.length()>longest.length() ) {
            longest = b;
        }

        if (c.contains(letter) && c.length()>longest.length() ) {
            longest = c;
        }

        System.out.println(longest);
/*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
    }
}

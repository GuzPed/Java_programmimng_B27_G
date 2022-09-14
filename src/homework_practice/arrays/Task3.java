package homework_practice.arrays;

public class Task3 {
    /*
    Shortest and Longest words from String array

	• Write a program that can return the shortest string element from a String array
	• Write a program that can return the longest string element from a String array

Hint: a good default value is the first element
     */
    public static void main(String[] args) {


        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen" };

        String min = numbers[0];
        String max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() < min.length()) {
                 min = numbers[i];
            }

            if (numbers[i].length() < max.length()) {
                max = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

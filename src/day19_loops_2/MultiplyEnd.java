package day19_loops_2;

public class MultiplyEnd {
    public static void main(String[] args) {
        /*        Multiply End
Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????
	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */
        String input = "Hello?";
        int number = 3;
        int length = input.length();
        String output = "";

        for (int a = 0; a < number; a++) {
            input += input.charAt(length-1);

        }
        System.out.println(input);


    }
}

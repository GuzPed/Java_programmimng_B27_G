package homework_practice.loops_practices;

public class Task11 {
    public static void main(String[] args) {
        /*
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
	Ex:
		Input:
			2juMp41EEkd4s4
		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers
         */
        String str = "2juMp41EEkd4s4";

        int countUp = 0;
        int countLow = 0;
        int countNum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) > '0' && str.charAt(i) < '9' ) {
                countNum++;
            } else if (str.charAt(i) > 'a' && str.charAt(i) < 'z' ) {
                countLow++;
            } else if (str.charAt(i) > 'A' && str.charAt(i) < 'Z' ) {
                countUp++;


            }
        }
        System.out.println(countUp+  " uppercase letters");
        System.out.println(countLow+  " lowercase letters");
        System.out.println(countUp+  " numbers");
    }}

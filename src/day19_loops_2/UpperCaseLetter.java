package day19_loops_2;
public class UpperCaseLetter {
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
        String word = "2juMp41EEkd4s4 ";
        int length = word.length();
        int sumUpper =0;
        int sumLower = 0;
        int sumNumbers = 0;

        for (int kkk = 0; kkk <length; kkk++) {
            if (word.charAt(kkk) >='A' && word.charAt(kkk) <= 'Z' ) {
                sumUpper++;
            }

            if (word.charAt(kkk) >='a' && word.charAt(kkk) <= 'z' ) {
                sumLower++;
            }
            if (word.charAt(kkk) >='0' && word.charAt(kkk) <='9' ) {
                sumNumbers++;
            }


        }
        System.out.println(sumUpper + " uppercase letters");
        System.out.println(sumLower + " lowercase letters");
        System.out.println(sumNumbers + " numbers");


    }
}

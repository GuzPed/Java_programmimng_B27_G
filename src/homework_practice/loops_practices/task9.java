package homework_practice.loops_practices;

public class task9 {
    public static void main(String[] args) {
        /*
        Space program

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        String str = "more words";
        String newStr ="";

        for (int i=0; i<str.length(); i++) {
            if (str.contains(" ")) {
                str=str.replace(" ", "_");
            }

            newStr += str.charAt(i) + " ";

        }

        System.out.println(newStr.trim());
    }
}

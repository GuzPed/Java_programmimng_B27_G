package day19_loops_2;

public class SpaceProgram {
    public static void main(String[] args) {
       /* Space program

        Given a String return a version of with spaces between all of the letters.
                If there is already a space in the String put an underscore

        Ex: java	-> j a v a
        space 	-> s p a c e
        more words -> m o r e _ w o r d s*/

        String example = "more words";
        int length = example.length();
        String newExample = "";

        for (int a = 0; a < length; a++) {

            if (example.contains(" ")) {
                example = example.replace(" ", "_");
            }

            newExample += example.charAt(a) + " ";
}


        System.out.print(newExample.trim());



    }
}

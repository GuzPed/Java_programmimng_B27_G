package homework_practice.loops_practices;

public class Task14 {
    public static void main(String[] args) {
        /*
        Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
         */

       String words = "This has multiple words";
    //    String[] a = words.split(" ");
    //    System.out.println(a.length);

        int count =1;
              for (int i=0; i<words.length(); i++) {
            if (words.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);

    }
}

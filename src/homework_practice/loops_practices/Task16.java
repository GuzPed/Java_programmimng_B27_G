package homework_practice.loops_practices;

public class Task16 {
    public static void main(String[] args) {
        /*
        Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
         */
        String word = "ja-va-ja-va";
        int count =1;

        for (int i=0; i<word.length();i++) {
            if (word.charAt(i) == '-') {
                count++;
            }
        }
        System.out.println(count);


    }
}

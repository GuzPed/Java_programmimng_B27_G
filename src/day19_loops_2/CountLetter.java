package day19_loops_2;

public class CountLetter {
    public static void main(String[] args) {
        String word = "java";
        int count = 0;

        for (int i=0; i<word.length(); i++)
        {
            if (word.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);


    }
}

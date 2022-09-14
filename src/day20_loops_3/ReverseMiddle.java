package day20_loops_3;

public class ReverseMiddle {
    public static void main(String[] args) {
        String str = "I love java";
        int start = str.indexOf(' ')+1;
        int end = str.lastIndexOf(' ');
        String middleWord = str.substring(start,end);

        String reverseMiddle = "";

        for (int i = middleWord.length()-1; i>=0; i--) {
            reverseMiddle+=middleWord.charAt(i);

        }
        System.out.println(str.substring(0,str.indexOf(' ')) + " " +reverseMiddle + str.substring(str.lastIndexOf(' ')));






    }
}

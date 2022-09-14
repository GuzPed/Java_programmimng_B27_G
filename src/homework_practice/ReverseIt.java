package homework_practice;

public class ReverseIt {
    public static void main(String[] args) {
        String a = "The quick brown fox";
        int length = a.length();
        String back = "";



       for (int last = length-1; last >=0; last-- ) {
            back += a.charAt(last);

        }

        System.out.println(back);


    }
}

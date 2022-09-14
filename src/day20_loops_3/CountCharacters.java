package day20_loops_3;

public class CountCharacters {
    public static void main(String[] args) {
        String s = "2juMp41EEkd4s4 ";
        int length = s.length();
        int sumUpper =0, sumLower = 0, sumNumbers = 0;
        for (int i =0; i< s.length(); i++ ) {
        char eachLetter = s.charAt(i);

        if (eachLetter>='A' && eachLetter <= 'Z') {
            sumUpper++;
        } else if (eachLetter>='a' && eachLetter <= 'z') {
            sumLower++;
        } else if (eachLetter>='0' && eachLetter <= '9') {
            sumNumbers++;
        }

    }
        System.out.println(sumUpper + " uppercase letters");
        System.out.println(sumLower + " lowercase letters");
        System.out.println(sumNumbers + " numbers");
} }

package homework_practice.String_practices;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String words = input.nextLine().trim();
        System.out.println(words.toLowerCase());
        System.out.println(words.length());




    }
}

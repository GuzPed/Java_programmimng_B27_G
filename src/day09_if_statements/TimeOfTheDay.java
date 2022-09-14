package day09_if_statements;

import java.util.Scanner;

public class TimeOfTheDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" What is the hour now. Use 24 format");
        int a = input.nextInt();

        if (a>=6 && a<=11) {
            System.out.println("Good morning");
        } else if (a>=12 && a<=16) {
            System.out.println("good evening");
        } else if ((a>=17 && a<=23)|| (a>=0 && a<=5)) {
            System.out.println("good night");
        }



    }
}

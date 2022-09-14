package day10_if_else_statements;

import java.util.Scanner;

public class CampusTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" What is the hour now. Use 24 format");
        int b = input.nextInt();
        String message = ""; // delaring and assining a String with a value empty space "". Default starting value

        if (b>=6 && b<=11) {
            message = "Good morning";
        } else if (b>=12 && b<=16) {
           message = "good evening";
        } else if ((b>=17 && b<=23)|| (b>=0 && b<=5)) {
            message = "good night";
        }

        System.out.println(message);



    }
}

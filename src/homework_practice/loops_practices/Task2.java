package homework_practice.loops_practices;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        enter 5 number and count how many positive and how many negative
         */
        Scanner input = new Scanner(System.in);
     int nums =0;
        int cointPos = 0;
        int countNeg = 0;

        while (nums < 5) {
            System.out.println("Enter 5 numbers");
            int number = input.nextInt();

            if (number >= 5) {
                cointPos++;
            } else {
                countNeg++;
            }
            nums++;
        }
        System.out.println("positive: " + cointPos);
        System.out.println("negative:  " + countNeg);
    }
}

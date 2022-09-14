package day23_arrays_day2;

import java.util.Scanner;

public class NumberToWord_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number from 0 to 15 to see the number in word formar");
        int num = input.nextInt();

        String[] number ={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

        if (num>=0 && num<=15) {
            System.out.println(number[num]);

        } else  {
            System.out.println("invalid number");
        }



    }
}

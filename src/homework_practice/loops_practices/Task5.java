package homework_practice.loops_practices;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean numberIsPositive = true;
        int sum =0;

        while (numberIsPositive) {
            System.out.println("Enter the number");
            int number = input.nextInt();

            if (number>=0) {
                sum+=number;
            } else {
                numberIsPositive =false;
                //break;
            }



        }
        System.out.println(sum);




    }
}

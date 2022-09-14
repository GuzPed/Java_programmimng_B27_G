package day07_scanner;

import java.util.Scanner;

public class PracticeScanner5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your salary per year");
        double salary = input.nextDouble();
        System.out.println("Please enter your number of hours per week");
        int hours = input.nextInt();

        double hourlyRate = salary/(hours*52);
        System.out.println("Your hourly rate is " + hourlyRate);



    }

}
